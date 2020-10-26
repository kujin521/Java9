package chapter.ch03.sec03;

/**
 * Runnable
 * 接口 示例
 */
public class RunnableDemo {
    public static void main(String[] args) {
        Runnable task = new HelloTask();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Thread started");
    }
}

class HelloTask implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello, World!");
        }
    }
}