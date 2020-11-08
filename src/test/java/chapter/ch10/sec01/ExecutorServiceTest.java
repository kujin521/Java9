package chapter.ch10.sec01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * ExecutorServiceTest
 * todo
 *
 * @author kujin
 * 创建时间：2020/11/1
 * @version 1
 */

public class ExecutorServiceTest {
    public static void main(String[] args) throws IOException {
        NetworkService service = new NetworkService(8788, 10);
        service.run();
        ExecutorService pool = Executors.newCachedThreadPool();
        pool.execute(new Handler(new Socket()));
        service.shutdownAndAwaitTermination(pool);
    }
}

/**
 * 这是一个网络服务的草图，其中螺纹在一个线程池服务传入的请求。
 * 它使用预配置Executors.newFixedThreadPool工厂方法：
 */
class NetworkService implements Runnable {
    private final ServerSocket serverSocket;
    private final ExecutorService pool;

    public NetworkService(int port, int poolSize)
            throws IOException {
        serverSocket = new ServerSocket(port);
        pool = Executors.newFixedThreadPool(poolSize);
    }

    public void run() { // 运行服务
        try {
            for (;;) {
                pool.execute(new Handler(serverSocket.accept()));
            }
        } catch (IOException ex) {
            pool.shutdown();
        }
    }

    void shutdownAndAwaitTermination(ExecutorService pool) {
        pool.shutdown(); // 禁止提交新任务
        try {
            // 等待一段时间终止现有任务
            if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
                pool.shutdownNow(); // 取消当前执行的任务
                // 等待一段时间以使任务响应被取消
                if (!pool.awaitTermination(60, TimeUnit.SECONDS))
                    System.err.println("池没有终止");
            }
        } catch (InterruptedException ie) {
            // （重新）如果当前线程也被中断则取消
            pool.shutdownNow();
            // 保留中断状态
            Thread.currentThread().interrupt();
        }
    }
}

class Handler implements Runnable {
    private final Socket socket;
    Handler(Socket socket) { this.socket = socket; }
    public void run() {
        // 在套接字上读取和服务请求
        System.out.println("在套接字上读取和服务请求");
    }
}
