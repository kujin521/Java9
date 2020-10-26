package chapter.ch02;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

/**
 * BigDecimal_Demo
 * Java在java.math包中提供的API类BigDecimal，用来对超过16位有效位的数进行精确的运算。
 * 双精度浮点型变量double可以处理16位有效数，
 * 但在实际应用中，可能需要对更大或者更小的数进行运算和处理。
 * 一般情况下，对于那些不需要准确计算精度的数字，
 * 我们可以直接使用Float和Double处理，但是Double.valueOf(String) 和Float.valueOf(String)会丢失精度。
 * 所以开发中，如果我们需要精确计算的结果，则必须使用BigDecimal类来操作。
 * @author kujin
 * 创建时间：2020/10/25
 * @version 1
 */
public class BigDecimal_Demo {
    public static void main(String[] args) {
        //构造函数
        BigDecimal decimalint = new BigDecimal(1);
        BigDecimal decimaldouble = new BigDecimal(0.1);
        BigDecimal decimallong = new BigDecimal(666l);
        BigDecimal decimalstr = new BigDecimal("0.1");
        System.out.println("构造函数");
        System.out.printf("%s\t%s\t%s\t%s \n",decimalint,decimaldouble,decimallong,decimalstr);

        methods(decimalint, decimalstr);

        compareTo(decimalint, decimaldouble);

        //BigDecimal格式化
        bigDecimal_Format();

        /**
         * 通过BigDecimal的divide方法进行除法时当不整除，出现无限循环小数时，就会抛异常：
         * java.lang.ArithmeticException:
         *  Non-terminating decimal expansion;
         *  no exact representable decimal result.
         * 解决方法：
         * ​	divide方法设置精确的小数点，如：divide(xxxxx,2)
         */

        /**
         * 总结
         * 在需要精确的小数计算时再使用BigDecimal，BigDecimal的性能比double和float差，在处理庞大，复杂的运算时尤为明显。故一般精度的计算没必要使用BigDecimal。
         * 尽量使用参数类型为String的构造函数。
         * BigDecimal都是不可变的（immutable）的， 在进行每一次四则运算时，都会产生一个新的对象 ，所以在做加减乘除运算时要记得要保存操作后的值。
         */

    }

    /**
     * 格式化样式
     * NumberFormat
     */
    private static void bigDecimal_Format() {
        System.out.println("格式化样式");
        NumberFormat currency = NumberFormat.getCurrencyInstance(); //建立货币格式化引用
        NumberFormat percent = NumberFormat.getPercentInstance();  //建立百分比格式化引用
        percent.setMaximumFractionDigits(3); //百分比小数点最多3位

        BigDecimal loanAmount = new BigDecimal("15000.48"); //贷款金额
        BigDecimal interestRate = new BigDecimal("0.008"); //利率
        BigDecimal interest = loanAmount.multiply(interestRate); //相乘

        System.out.println("贷款金额:\t" + currency.format(loanAmount));
        System.out.println("利率:\t" + percent.format(interestRate));
        System.out.println("利息:\t" + currency.format(interest));
    }

    /**
     * 常用方法
     * @param decimalint
     * @param decimalstr
     */
    private static void methods(BigDecimal decimalint, BigDecimal decimalstr) {
        //常用方法
        System.out.println("常用方法");
        System.out.println(decimalint.add(decimalstr));//相加 1+0.1=1.1
        System.out.println(decimalint.subtract(decimalstr));//相减 1-0.1=0.9
        System.out.println(decimalint.multiply(decimalstr));//相乘 1*0.1=0.1
        //相除 指定元素模式up向上取值(5.2=6 -1.1=-2)
        System.out.println(decimalint.divide(decimalstr, RoundingMode.UP));//1/0.1=10
        System.out.println(decimalint.toString());//转换字符串 1
        System.out.println(decimalint.doubleValue());//转换双精度 1.0
        System.out.println(decimalint.floatValue());//转换单精度数 1.0
        System.out.println(decimalint.longValue());//长整数 1
        System.out.println(decimalint.intValue());//转换整数 1
    }

    /**
     * 比较大小
     * @param decimalint
     * @param decimaldouble
     */
    private static void compareTo(BigDecimal decimalint, BigDecimal decimaldouble) {
        //比较大小 -1小于 0 等于 1大于
        int compareTo = decimalint.compareTo(decimaldouble);
    }
}
