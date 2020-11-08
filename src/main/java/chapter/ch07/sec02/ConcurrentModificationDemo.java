package chapter.ch07.sec02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ConcurrentModificationDemo {
    public static void main(String[] args) {
        //定义ArrayList集合
        Collection<String> coll = new ArrayList<>();
        coll.add("Peter");
        coll.add("Paul");
        coll.add("Mary");
        System.out.println(coll);
        //获取集合迭代器
        Iterator<String> iter1 = coll.iterator();
        Iterator<String> iter2 = coll.iterator();
        iter2.next();//获取下一个item
        iter2.remove();//删除当前访问的item
        System.out.println(coll);
        iter1.next();//由于iter1 和tier2 访问的是同一个集合,并且该集合数据结构已经发生改变 会抛出ConcurrentModificationException
        System.out.println(coll);
    }
}
