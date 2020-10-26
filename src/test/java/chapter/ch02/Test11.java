package chapter.ch02;

import java.time.LocalDate;

import static java.time.LocalDate.of;

/**
 * Test11
 * todo
 *
 * @author kujin
 * 创建时间：2020/10/25
 * @version 1
 */
public class Test11 {
    public void main() {
        //输出表头 周一...周七
        System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
        final int month = 11; //定义月份11
        LocalDate date = of(2017, month, 1);//设置时间为2017-11-1
        //获取当前日期是周几
        final int dayOfWeek = date.getDayOfWeek().getValue();
        //在之前的周期用 空格表示
        for (int i=1; i<dayOfWeek; ++i) {
            System.out.printf("%4c", ' ');
        }
        //遍历当前月 的天数 打印日期
        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            if (date.getDayOfWeek().getValue() == 7) {//如果是星期天 就换行
                System.out.println();
            }
            date = date.plusDays(1);//日期加一天
        }

        //这里打印了下一月的行数
        final int continueValue = (8 - date.getDayOfWeek().getValue())%7 + 7;
        for (int i=0; i<continueValue; ++i) {
            System.out.printf("%4d", date.getDayOfMonth());
            if (date.getDayOfWeek().getValue() == 7) {
                System.out.println();
            }
            date = date.plusDays(1);
        }
    }
}
