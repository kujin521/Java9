package chapter.ch03.sec04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * lambda 表达式 示例
 */
public class LambdaDemo {
    public static void main(String[] args) {
        String[] friends = { "Peter", "Paul", "Mary" };
        //使用lambda表达式 函数式接口 该接口必须只要一个方法 进行排序
        Arrays.sort(friends,
                (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(friends));
        ArrayList<String> enemies = new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));
        //删除所有的null值
        enemies.removeIf(e -> e == null);
        System.out.println(enemies);        
    }
}
