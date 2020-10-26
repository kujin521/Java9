package chapter.ch03.sec05;

import java.util.ArrayList;

/**
 * lambda 构造函数引用
 *
 */
public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        //定义字符串 数组
        ArrayList<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Paul");
        names.add("Mary");
        //将names 放入 Stream 调用map方法 收集结果
        Employee[] employees = names.stream().map(Employee::new).toArray(Employee[]::new);

        //分解步骤
//        Stream<Employee> stream = names.stream().map(Employee::new);
//        Object[] employees=stream.toArray();
        //优化 返回自己想要的数组类型
//        Employee[] buttons = stream.toArray(Employee[]::new);


        for (Employee e : employees) System.out.println(e.getName());
    }
}
