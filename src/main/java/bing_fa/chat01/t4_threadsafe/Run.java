package bing_fa.chat01.t4_threadsafe;

/**
 * Run
 * todo
 *
 * @author kujin
 * 创建时间：2020/11/6
 * @version 1
 */
public class Run {
    public static void main(String[] args) {
        Alogin alogin = new Alogin();
        alogin.start();
        Blogin blogin = new Blogin();
        blogin.start();
    }
}
