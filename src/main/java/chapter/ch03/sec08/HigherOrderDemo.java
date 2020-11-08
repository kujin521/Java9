package chapter.ch03.sec08;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 高阶函数
 * 处理或返回函数的函数被称为高阶函数
 *
 */
public class HigherOrderDemo {
    /**
     * 根据direction 的正负 升降排序
     * @param direction 1 -1
     * @return 排序数组接口
     */
    public static Comparator<String> compareInDirecton(int direction) {
        return (x, y) -> direction * x.compareTo(y);
    }

    /**
     *
     * @param comp
     * @return
     */
    public static Comparator<String> reverse(Comparator<String> comp) {
        return (x, y) -> -comp.compare(x, y);
    }
    
    public static void main(String[] args) {
        String[] words = { "Mary", "had", "a", "little", "lamb" };
        Arrays.sort(words, compareInDirecton(-1));
        System.out.println(Arrays.toString(words));
        Arrays.sort(words, reverse(String::compareToIgnoreCase));
        System.out.println(Arrays.toString(words));        
    }
}
