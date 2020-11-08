package chapter.ch07.sec02;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        //双链接的列表执行List和Deque接口
        List<String> friends = new LinkedList<>();
        ListIterator<String> iter = friends.listIterator();
        iter.add("Fred"); // Fred |
        iter.add("Wilma"); // Fred Wilma |
        //返回列表和移动光标位置向后上一个元素
        iter.previous(); // Fred | Wilma
        iter.set("Barney"); // Fred | Barney
        System.out.println(friends);
    }
}
