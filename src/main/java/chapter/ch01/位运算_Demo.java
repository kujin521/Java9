package chapter.ch01;

import org.junit.Test;

/**
 * 位运算_Demo
 * todo
 *
 * @author kujin
 * 创建时间：2020/11/5
 * @version 1
 */
public class 位运算_Demo {

    /**
     * 实现位与操作
     *  有0 为0
     */
    @Test
    public void 实现位与操作(){
        int x=13;
        int y=7;
        System.out.printf("%s的二进制%s \t",x,Integer.toBinaryString(x));
        System.out.printf("%s的二进制%s \t",y,Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(y&x));
        System.out.println(x&y);
    }
    /**
     * 实现位或操作
     * 有1 为1
     */
    @Test
    public void 实现位或操作(){
        int x=13;
        int y=7;
        System.out.println(x|y); //15
    }
    /**
     * 移位操作
     */
    @Test
    public void 移位操作(){
        int x=3;
        System.out.println("左位移后的计算结果: "+(x<<2));//2的3次方计算
        System.out.println("原始变量执行后的结果: "+x);
    }
}
