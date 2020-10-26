package chapter.ch01;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Random;

/**
 * Ch01Test
 * 01课后练习
 *
 * @author kujin
 * 创建时间：2020/10/24
 * @version 1
 */
public class Ch01Test {
    int n=99;
    /**
     * exe1
     * 写个程序，它读取一个整数并以二进制、八进制和十六进制输出。
     * 以十六进制浮点数输出倒数。
     *  第一次将小数乘以十六，得到的数的整数部分就是小数的第一位，
     *  然后，去掉整数后的小数又乘以十六，
     *  又将得到的数的整数作为小数点后的第二位。
     *  依次乘下去。直到都乘为整数，到最后一位。
     */
    @Test
    public void exe1(){
        System.out.printf("十进制输出%d\n",n);
        System.out.printf("二进制输出"+Integer.toBinaryString(n)+"\n");
        System.out.printf("十六进制输出"+"%x\n",n);
        System.out.printf("八进制输出%o\n",n);
        System.out.println(toReciprocal(n));

    }

    // 以十六进制浮点数输出倒数
    /*
     * 第一次将小数乘以十六，得到的数的整数部分就是小数的第一位，然后，去掉整数后的小数又乘以十六，
     * 又将得到的数的整数作为小数点后的第二位。依次乘下去。直到都乘为整数，到最后一位。
     */
    private String toReciprocal(int decimal) {
        if(decimal == 0){
            return "参数不能为0";
        }
        float flo = 1 / (float) decimal;
        String reciprocal = "0.";
        for (int i = 0; i<10; i++) {
            if(flo == 0){
                break;
            }
            float temp = flo * 16;
            int inte = (int) Math.floor(temp);
            flo = temp - inte;
            String inteStr = "";

            switch (inte) {
                case 10:
                    inteStr = "A";
                    break;
                case 11:
                    inteStr = "B";
                    break;
                case 12:
                    inteStr = "C";
                    break;
                case 13:
                    inteStr = "D";
                    break;
                case 14:
                    inteStr = "E";
                    break;
                case 15:
                    inteStr = "F";
                    break;
                default:
                    inteStr = Integer.toString(inte);
            }
            reciprocal = reciprocal + inteStr;
        }
        return reciprocal;
    }

    /**
     * exe2
     * 写个程序，它读取整数，然后经过模运算转换为 0° ～ 359° 之间的值。
     * 首先以操作符 % 完成，然后再试 floorMod。
     */
    @Test
    public void exe2(){
        System.out.printf("度数%d\n",(160%360+360)%360);
        System.out.printf("度数%d\n",Math.floorMod(160, 360));
    }
    /**
     * exe3
     * 只用条件操作符，写一个程序，读取三个整数并输出最大的。使用 Math.max 实现同样的功能。
     */
    @Test
    public void exe3(){
        int a=1;
        int b=2;
        int c=3;
        System.out.println(
                a>b?(a>c)?a:c:(b>c)?b:c
            );
        System.out.println(Math.max(a,Math.max(b,c)));
    }
    /**
     * exe4
     * 写个程序，输出 double 类型中的最小正数值和最大正数值。
     * 提示：在 Java API 文档中查询 Math.nextUp
     */
    @Test
    public void exe4(){
        System.out.println(Math.nextUp(5.5f));
        System.out.println(Math.nextUp(5.5));
    }
    /**
     * exe5
     * 当你将一个 double 类型的值转换为 int 类型的值，
     * 并且该值大于最大可能的 int 值时，会发生什么？试试看。
     */
    @Test
    public void exe5(){
        System.out.println((int) 3.5);
    }
    /**
     * exe6
     * 写个程序，计算阶乘 n! = 1 × 2 × ... × n，使用 BigInteger。
     * 计算 1000 的阶乘。
     */
    @Test
    public void exe6(){
        BigInteger n= BigInteger.valueOf(3);
        System.out.println(bigInteger(n));
    }

    private BigInteger bigInteger(BigInteger n) {
        if (n.equals(BigInteger.ONE)){
            return BigInteger.ONE;
        }else {
            // 循环迭代
            // subtract返回一个BigInteger，其值是(this - val)
            return n.multiply(bigInteger(n.subtract(BigInteger.ONE)));
        }
    }
    
    /**
     * exe7
     * 写个程序，读取 0～65535 之间的两个数，在 short 变量中存储，
     * 并计算它们的无符号之和、之差、之积、之商和余数，不要将它们转换为 int 类型。
     */
    @Test
    public void exe7(){
        short sh1= (short) new Random().nextInt(65535);
        short sh2= (short) new Random().nextInt(65535);
        System.out.printf("和%s 差%s 积%s 商%s 余数%s",sh1+sh2,sh1-sh2,
                sh1*sh2,sh1/sh2,sh1%sh2);
    }
    /**
     * exe8
     * 写个程序，读取一个字符串并输出该字符串所有的非空子字符串。
     */
    @Test
    public void exe8(){
        String str="写个程序 读取一个字符串并 输出该字符串所有的 非空 子字符串。";
        String[] s1 = str.split("\\s+");
        for (String s : s1) {
            System.out.println(s);
        }
    }
    
    /**
     * exe9
     */
    @Test
    public void exe9(){
        //todo
        
    }
    /**
     * exe10
     * 写个程序，先产生随机的 long 型整数，然后模 36，
     * 最后输出由字母和数字组成的随机字符串。
     */
    @Test
    public void exe10(){
        //todo
        
    }
    
    /**
     * exe11
     */
    @Test
    public void exe11(){
        //todo
        
    }
    /**
     * exe12
     */
    @Test
    public void exe12(){
        //todo
        
    }
    /**
     * exe13
     * 写个程序，可以输出一组彩票组合，该组合由 1~49 之间的 6 个不同数字组成。
     * 为产生 6 个不同数字，先用 1～ 49 填充一个数组。
     * 然后随机选择一个索引并删除对应元素，重复 6 次，并输出排序后的结果。
     */
    @Test
    public void exe13(){
        //todo
        
    }
    /**
     * exe14
     * 写个程序，读取整型的二维数组并判断它是否是魔方
     * （也就是，所有的行之和、列之和，以及对角线之和都是相同的）。
     * 接受可以分隔成单个整数的行输入，当用户输入空白行时停止。例如，如下输入
     */
    @Test
    public void exe14(){

        
    }
    /**
     * exe15
     */
    @Test
    public void exe15(){
        //todo

    }
}
