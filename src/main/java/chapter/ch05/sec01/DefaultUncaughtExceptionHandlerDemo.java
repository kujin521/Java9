package chapter.ch05.sec01;

/**
 * 默认未捕获的异常处理程序演示
 */
public class DefaultUncaughtExceptionHandlerDemo {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((thread, ex) -> {
            System.err.println(ex.getMessage());
            System.err.println("Goodbye, cruel world!");
        });
        System.out.println(1 / 0);
    }
}
