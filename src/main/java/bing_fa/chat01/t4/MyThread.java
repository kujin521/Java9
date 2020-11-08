package bing_fa.chat01.t4;

/**
 * MyThread
 * todo
 *
 * @author kujin
 * 创建时间：2020/11/6
 * @version 1
 */
public class MyThread extends Thread {
    private int count=5;
    @Override
    public void run() {
        count--;
        System.out.println("由 "+this.currentThread().getName()+"计算"+count);
    }
}
