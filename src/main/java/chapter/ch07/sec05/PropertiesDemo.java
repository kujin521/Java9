package chapter.ch07.sec05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * 持久的属性集
 * 该Properties类代表一个持久的属性集。
 * 该Properties可以被保存到一个流或从流中加载。
 * 在属性列表中每个键及其对应的值是一个字符串。
 * 一个属性列表可包含另一个属性列表作为它的“默认值”;
 * 如果属性键没有在原有的属性列表中找到搜索第二个属性列表。
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties settings = new Properties();
        settings.put("width", "200");
        settings.put("title", "Hello, World!");
        Path path = Paths.get("demo.properties");
        try (OutputStream out = Files.newOutputStream(path)) {
            settings.store(out, "Program Properties");
        }
        
        settings = new Properties();
        try (InputStream in = Files.newInputStream(path)) {
            settings.load(in);
        }
        System.out.println(settings);
        
        String title = settings.getProperty("title", "New Document");
        String height = settings.getProperty("height", "100");
        System.out.println(title);
        System.out.println(height);
        System.out.println();
        System.out.println("系统属性");
        Properties sysprops = System.getProperties();
        sysprops.forEach((k, v) -> System.out.printf("%s=%s\n", k, v));
    }
}
