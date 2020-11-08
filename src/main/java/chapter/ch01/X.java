package chapter.ch01;

/**
 * X
 * 类的静态变量的理解
 *
 * @author kujin
 * 创建时间：2020/11/6
 * @version 1
 */
public class X {
    private static int a=1;
    public static void main(String[] args) {
        modify(a);
        System.out.println(a);
    }

    public static void modify(int a) {
        ++a;
    }
}
