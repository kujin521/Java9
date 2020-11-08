package chapter.ch02;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * LearnBean
 * 实现一个 Car 类，模拟汽车沿着 x 轴移动，随着移动消耗燃油。
 * 提供一个按照给定英里数驱动汽车的方法、给汽车燃料箱添加给定加仑（燃油）的方法，以及获取原点到油位的当前距离的方法。
 * 在构造函数中指定燃料效率（单位为每加仑多少英里）。Car 类应该是不可修改类吗？为什么或者为什么不应该？
 * @author kujin
 * 创建时间：2020/10/25
 * @version 1
 */
public class LearnBean {

    public void start() {
        // 使用下面第一种方式的 2.3 初始化 BigDecimal，其值将变成 2.2999999999999998，
        // 所以建议使用第二种方式赋值
        // method 1
//        Car car = new Car(new BigDecimal(2.3), new BigDecimal(100));
        // method 2
        Car car = new Car(new BigDecimal("2.3"), new BigDecimal(100));
        car.move(new BigDecimal(200));
        System.out.println("Current move miles: " + car.getMiles().toString());
    }

    public static class  Car{
        private final BigDecimal burningPower; //能量
        private BigDecimal oilVolume;//油量
        private BigDecimal miles;//英里

        public Car(BigDecimal burningPower, BigDecimal oilVolume, BigDecimal miles) {
            this.burningPower = burningPower;
            this.oilVolume = oilVolume;
            this.miles = miles;
        }

        public Car(BigDecimal burningPower, BigDecimal oilVolume) {
            this(burningPower, oilVolume, new BigDecimal(0));
        }

        public Car(BigDecimal burningPower) {
            this(burningPower, new BigDecimal(0), new BigDecimal(0));
        }

        public void move(BigDecimal miles) {
            if (oilVolume.compareTo(miles.divide(burningPower,
                    RoundingMode.UP)) == 1) {
                this.miles = this.miles.add(miles);
            } else {
                this.miles = this.miles.add(oilVolume.multiply(burningPower));
            }
        }

        public void addOil(BigDecimal oilVolume) {
            this.oilVolume = this.oilVolume.add(oilVolume);
        }

        public BigDecimal getMiles() {
            return miles;
        }
    }
}
