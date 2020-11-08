package chapter.ch04.sec03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("第一个操作数: ");
        int a = in.nextInt();
        System.out.print("操作符: ");
        String opSymbol = in.next();
        System.out.print("第二操作数: ");
        int b = in.nextInt();
        /**
         * 循环遍历操作符
         */
        for (Operation op : Operation.values()) {
            //如果操作符存在
            if (op.getSymbol().equals(opSymbol)) {
                int result = op.eval(a, b);//执行运算
                System.out.println(result);
            } 
        }
    }
}
