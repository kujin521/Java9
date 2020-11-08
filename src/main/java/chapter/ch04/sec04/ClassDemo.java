package chapter.ch04.sec04;

/**
 * 运行时类信息
 */
public class ClassDemo {
    public static void main(String[] args) throws ReflectiveOperationException {
        Object obj = System.out;
        Class<?> cl = obj.getClass();
        
        System.out.println("该对象是" + cl.getName());//该对象是java.io.PrintStream的实例

        String className = "java.util.Scanner";
        cl = Class.forName(className);
            // 描述java.util.Scanner类的对象
        cl = java.util.Scanner.class;
        System.out.println(cl.getName());//java.util.Scanner

        Class<?> cl2 = String[].class; // 描述数组类型String []
        System.out.println(cl2.getName());//[Ljava.lang.String;
        System.out.println(cl2.getCanonicalName());//java.lang.String[]

        Class<?> cl3 = Runnable.class; // 描述Runnable接口
        System.out.println(cl3.getName());//java.lang.Runnable

        Class<?> cl4 = int.class; // 描述int类型
        System.out.println(cl4.getName());//int

        Class<?> cl5 = void.class; // 描述空类型
        System.out.println(cl5.getName());//void
    }
}
