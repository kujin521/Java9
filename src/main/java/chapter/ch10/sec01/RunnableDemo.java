package chapter.ch10.sec01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Runnable 线程接口<br>
 *     可以异步执行 但不会返回结果
 *     ExecutorService将任务实例列入执行计划
 *     run方法在线程中执行
 *     通过使用单独处理器或同一处理器的不同时间片 多个线程可以并发执行
 *
 */
public class RunnableDemo {
    public static void main(String[] args) {
        // 定义一个打印hello的线程
        Runnable hellos = () -> {
            for (int i = 1; i <= 1000; i++) 
                System.out.println("Hello " + i);
        };
        //定义一个goodbyes 线程 打印 Goodbye 1000次
        Runnable goodbyes = () -> {
            for (int i = 1; i <= 1000; i++) 
                System.out.println("Goodbye " + i);
        };
        //Excutors 类有一个工厂方法提供不同调度策略的executor使用
        // 会产生一个针对很多短暂任务或任务大多数事件处于等待状态的程序优化executor
        ExecutorService executor = Executors.newCachedThreadPool();
        //启动一个有序关闭在以前已提交任务的执行中，但没有新的任务将被接受
        executor.execute(hellos);        
        executor.execute(goodbyes);
        //启动一个有序关闭在以前已提交任务的执行中，但没有新的任务将被接受
        executor.shutdown();
    }
}