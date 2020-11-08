package bing_fa.chat01;

/**
 * Test1
 * todo
 *
 * @author kujin
 * 创建时间：2020/11/6
 * @version 1
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());//打印线程名称
        try {
            /**
             * Locked ownable synchronizers
             */
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
