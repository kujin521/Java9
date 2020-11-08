package chapter.ch04.sec03;

public class EnumDemo {
    public static void main(String[] args) {
        Size notMySize = Size.valueOf("SMALL1");//如果Small不存在会报异常IllegalArgumentException
        System.out.println(notMySize);

        //遍历eum
        for (Size s : Size.values()) { System.out.println(s); }
        
        System.out.println(Size.MEDIUM.ordinal());//返回此枚举常数的序 从零开始
    }
}
