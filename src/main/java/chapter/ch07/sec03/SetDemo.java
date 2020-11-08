package chapter.ch07.sec03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        //创建无序HashSet集合 hash表结构
        Set<String> badWords = new HashSet<>();
        badWords.add("sex");
        badWords.add("drugs");
        badWords.add("c++");
        //根据输入的字符遍历集合
        Scanner in = new Scanner(System.in);
        System.out.print("请选择一个用户名: ");
        String username = in.next();        
        if (badWords.contains(username.toLowerCase()))
            System.out.println("请选择一个不同的用户名");
        else
            System.out.println("注册 " + username + " 因为它不是 " + badWords);
        //有序Set集合 实现了Comparable接口
        TreeSet<String> countries = new TreeSet<>((u, v) ->
            u.equals(v) ? 0
            : u.equals("USA") ? -1
            : v.equals("USA") ? 1
            : u.compareTo(v));
        
        countries.add("Bahrain");
        countries.add("Australia");
        countries.add("USA");
        countries.add("Canada");
        System.out.println(countries);
    }
}
