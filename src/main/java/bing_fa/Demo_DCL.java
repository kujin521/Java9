package bing_fa;

/**
 * Demo_DCL
 *  单例模式的线程安全
 *
 * @author kujin
 * 创建时间：2020/11/3
 * @version 1
 */
public class Demo_DCL {

}
class Sington{
    private volatile static Sington instance;
    public static Sington getInstance(){
        if(instance==null){
            synchronized (Sington.class){
                if (instance==null){
                    // instance==new Sington(); //有问题的代码

                }
            }
        }
        return instance;
    }
}
