package bing_fa;

/**
 * Run3
 * todo
 *
 * @author kujin
 * 创建时间：2020/11/2
 * @version 1
 */
public class Run3 {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            new Thread(){
                public void run(){
                    try{
                        Thread.sleep(500000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                };
            }.start();
        }
    }
}
