package bing_fa.chat01.t4_threadsafe;

/**
 * Alogin
 * todo
 *
 * @author kujin
 * 创建时间：2020/11/6
 * @version 1
 */
public class Blogin extends Thread {
    @Override
    public void run() {
        super.run();
        LoginServlet.doPost("b","bb");
    }
}
