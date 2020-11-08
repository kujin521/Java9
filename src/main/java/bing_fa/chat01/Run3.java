package bing_fa.chat01;

/**
 * Run3
 * todo
 *
 * @author kujin
 * 创建时间：2020/11/6
 * @version 1
 */
public class Run3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(){
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName());
                        Thread.sleep(5000000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
