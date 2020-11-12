package chapter.ch09.sec02;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Demo_Files
 * todo
 *
 * @author kujin
 * 创建时间：2020/11/9
 * @version 1
 */
public class Demo_Files {
    /**
     * t_create
     */
    @Test
    public void t_create() throws IOException {
        Path path = Paths.get("a/b");
        //创建一个新目录
        Path directory = Files.createDirectory(path);
        //
        Path directories = Files.createDirectories(path);
    }
}
