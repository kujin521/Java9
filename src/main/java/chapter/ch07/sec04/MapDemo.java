package chapter.ch07.sec04;

import java.util.HashMap;
import java.util.Map;

/**
 * 将键映射到值的对象。 一个映射不能包含重复的键; 每个键可以最多一个值映射到。
 * 这个接口替换了的地方Dictionary类，这是一个完全的抽象类，而不是一个接口。
 * 所述Map界面提供了三个集合视图，其允许地图的内容应被视为一组键，集合的值，或设定键-值映射的。
 * 地图的顺序被定义为其中在地图上的集合视图迭代返回元素的顺序。
 * 一些map的实现，如TreeMap类，作出具体的保证，而他们的订单; 其他的如HashMap类，
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> counts = new HashMap<>();
        counts.put("Alice", 1); //将键/值对添加到map
        counts.put("Alice", 2); // 更新密钥的值
        
        int count = counts.get("Alice");
        System.out.println(count);
        count = counts.getOrDefault("Barney", 0);
        System.out.println(count);
        
        String word = "Fred";
        counts.merge(word, 1, Integer::sum);
        counts.merge(word, 1, Integer::sum);
        System.out.println(counts.get(word));

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            process(key, value);
        }
        
        counts.forEach((k, v) -> process(k, v));
    }
    
    public static void process(String key, Integer value) {
        System.out.printf("Processing key %s and value %d\n", key, value);
    }
        
}
