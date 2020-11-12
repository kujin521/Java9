package chapter.ch05.sec03;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 记录日志
 * 一般通过System.out.println 输出
 * java有专门的java设计日志api
 */
public class LoggingDemo {
    public static void main(String[] args) {
        //打印logger日志
        Logger.getGlobal().info("Starting program");
        Logger.getGlobal().info(()->"启动程序 lamdba");
        //关闭logger日志
        Logger.getGlobal().setLevel(Level.OFF);
        Logger.getGlobal().info("Global logger turned off");

        //定义自己名字的日志
        Logger logger = Logger.getLogger("com.horstmann.corejava");
        /**
         * 日志级别
         * SEVER
         * WARNING
         * INFO
         * CONFIG
         * FINE
         * FINER
         * FINEST
         */
        logger.fine("Global logger turned off");
        //设置日志级别 fine及其以上级别的日志会被打印
        logger.setLevel(Level.FINE);
        logger.fine("Set logger to fine");
        //关闭默认的父处理器
        logger.setUseParentHandlers(false);
        //创建自己的处理器 并设置级别
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.FINE);
        logger.addHandler(handler);
        logger.fine("Configured handler");
    }
}
