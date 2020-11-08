package chapter.ch07.sec02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        //定义集合
        Collection<String> coll = new ArrayList<>();
        coll.add("Peter");
        coll.add("Paul");
        coll.add("Mary");
        //获取集合迭代器
        Iterator<String> iter = coll.iterator();
        //循环所有元素
        while (iter.hasNext()) {
            String element = iter.next();
            process(element);
        }
        //移除元素
        iter = coll.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            if (element.startsWith("M"))
                iter.remove();
        } 
        //移除元素 简化
        coll.removeIf(e -> e.endsWith("r"));
        
        for (String element : coll) 
            process(element);
    }
    
    public static void process(String s) { System.out.println("Processing " + s); }
}
