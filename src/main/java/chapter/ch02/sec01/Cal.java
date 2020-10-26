package chapter.ch02.sec01;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Mon Tue Wed Thu Fri Sat Sun
 *              1   2   3   4
 *  5   6   7   8   9  10  11
 * 12  13  14  15  16  17  18
 * 19  20  21  22  23  24  25
 * 26  27  28  29  30  31
 */
public class Cal {
    public static void main(String[] args) {
        //定义日期类
        // now()获取当前日期 dayOfMonth
        // - 当天的日到结果集，从1至28-31 这里设置为1号
        LocalDate date = LocalDate.now().withDayOfMonth(1);
        int month;  //定义月
        if (args.length >= 2) {         //如果程序有参数
            month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            date = LocalDate.of(year, month, 1);
        } else {
            //获取date月份
            month = date.getMonthValue();
        }
        
        System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
        //获取 date的周几
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
        for (int i = 1; i < value; i++) 
            System.out.print("    ");   //在空前加空格
        while (date.getMonthValue() == month) { //循环遍历当前月
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1); //天数加一
            if (date.getDayOfWeek().getValue() == 1) //换行
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) 
           System.out.println();
    }
}
