package chapter.ch01.sec05;

import org.junit.Test;

import java.time.*;

/**
 * Demo_ZoneId
 * 了解ZoneId
 * 一个时区的ID，如Europe/Paris
 *
 * @author kujin
 * 创建时间：2020/11/6
 * @version 1
 */
public class Demo_ZoneId {
    public static void main(String[] args) {
        demo1();
    }

    private static void demo1() {

    }

    /**
     * t1
     * 遍历输出 时区ID
     *  
     */
    @Test
    public void t1(){
        //todo
        for (String id : ZoneId.getAvailableZoneIds()) {
            if (id.contains("UTC"))
                System.out.println(id);
        }
    }
}
