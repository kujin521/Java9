package ch01.sec01;

import java.util.Random;

/**
 * HelloWord
 * todo
 *
 * @author kujin
 * 创建时间：2020/10/22
 * @version 1
 */
public class HelloWord {
    public static void main(String[] args) {
        System.out.println("Hello,World!");
        System.out.println("Hello,World!".length());

        Random generator=new Random();
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());

        System.out.printf("%8.2f",1000.0/3.0);
        System.out.println("输出结果长度: "+"  333.33".length());
    }
}
