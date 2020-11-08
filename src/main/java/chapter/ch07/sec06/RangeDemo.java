package chapter.ch07.sec06;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 集合固定范围实例
 *
 */
public class RangeDemo {
    public static void main(String[] args) {
        //定义一个固定的list
        List<String> sentence = List.of(("A man, a plan, a cat, a ham, a yak, a yam, " +
                "a hat, a canal, Panama!").split("[ ,]+"));
        //截取其中一段list
        List<String> nextFive = sentence.subList(5, 10);
        System.out.println(nextFive);

        //定义 根据其元素的自然顺序进行排序
        TreeSet<String> words = new TreeSet<>(sentence);
        words.add("zebra");
        SortedSet<String> ysOnly = words.subSet("y", "z");
        System.out.println(ysOnly);

        //一Set进一步提供关于元素的总体排序。
        // 这些元素使用其定购的自然排序，或者通过Comparator通常在创建有序集合时提供。
        SortedSet<String> nAndBeyond = words.tailSet("p");
        System.out.println(nAndBeyond);
    }
}
