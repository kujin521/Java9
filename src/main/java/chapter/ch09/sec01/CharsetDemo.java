package chapter.ch09.sec01;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * 字符集演示
 */
public class CharsetDemo {
    public static void main(String[] args) {
        System.out.println("此计算机上的默认字符集：" + Charset.defaultCharset());
        System.out.println("此JVM上的可用字符集： " + Charset.availableCharsets().keySet());
        
        String str = "Java\u2122";
        System.out.println(str);
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        showBytes(bytes);
            // 请注意，商标字符需要三个字节
        showBytes(str.getBytes(StandardCharsets.UTF_16));
            // 注意字节顺序标记
        showBytes(str.getBytes(StandardCharsets.ISO_8859_1));
            // The trademark character can't be encoded and becomes a ?
        
        System.out.println(new String(bytes, Charset.forName("windows-1252")));
            // 您如何分辨这是错误的编码？程序如何显示？
    }
    
    public static void showBytes(byte[] bytes) {
        for (byte b : bytes)
            System.out.printf("%2X ", b);
        System.out.println();
    }
}
