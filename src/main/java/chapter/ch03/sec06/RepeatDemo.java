package chapter.ch03.sec06;

import java.util.function.IntConsumer;

/**
 * 实现延迟执行
 * 场景
 *      在另一个单独的线程中运行代码
 *      多次运行代码
 *      在算法的恰当时刻运行代码
 *      在某些情况下运行代码(监听 按钮点击 数据到达)
 *      回调 在需要的时刻运行
 */
public class RepeatDemo {

    public static void repeat(int n, Runnable action) {//线程Runnable函数式接口
        for (int i = 0; i < n; i++)
            action.run();   //lambda 表达式被执行
    }

    public static void repeat(int n, IntConsumer action) {  //消费者接口
        for (int i = 0; i < n; i++)
            action.accept(i);//给定i 执行
    }

    public static void repeatMessage(String text, int count) {
        Runnable r = () -> {
           for (int i = 0; i < count; i++) {
              System.out.println(text);
           }
        };
        new Thread(r).start();                  
     }
    
    public static void main(String[] args) {
        repeat(10, () -> System.out.println("Hello, World!"));
        repeat(10, i -> System.out.println("Countdown: " + (9 - i)));
        repeatMessage("Hello", 10);
    }
}
