package chapter.ch02.sec04;

import java.text.NumberFormat;

public class StaticMethodDemo {
    public static void main(String[] args) {
        int dieToss = RandomNumbers.nextInt(1, 6); 
        System.out.println(dieToss);
//        NumberFormat是所有数字格式的抽象基类。 这个类提供了格式化和分析数字的接口。
//        为了格式化当前Locale的工厂类方法使用一个数字：
//                getInstance或getNumberInstance获得正常的数字格式
//                getIntegerInstance得到一个整数格式
//                getCurrencyInstance来获取货币数字格式
//                getPercentInstance获得的格式显示百分比
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyFormatter.format(x)); // Prints $0.10
        System.out.println(percentFormatter.format(x)); // Prints 10%
    }
}
