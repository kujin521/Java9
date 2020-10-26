package chapter.ch03.sec05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * lambda 优雅的方法使用
 * 操作符::方法名称或对象名称
 *      类::实例方法
 *      类::静态方法
 *      对象::实例方法
 */
public class MethodReferenceDemo {
    public static void main(String[] args) {
        String[] strings = { "Mary", "had", "a", "little", "lamb" };
        Arrays.sort(strings, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strings));
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));
        list.removeIf(Objects::isNull);
        list.forEach(System.out::println);
    }
}
