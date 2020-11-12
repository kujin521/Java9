package chapter.ch09.sec01;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * IOTest
 * InputStream源字节
 * OutputStream目标字节
 * Reader读取字节
 * Writer写入
 * @author kujin
 * 创建时间：2020/11/12
 * @version 1
 */
public class IOTest {
    Path path1= Paths.get("src/test/resources/a.txt");
    Path path2= Paths.get("src/test/resources/a2.txt");
    @Test
    public void t_reader_writer() throws IOException {
        //获取流对象
        InputStream in= Files.newInputStream(path1);
        int available = in.available();
        int read = in.read();//读取单个字节0~255
        System.out.printf("available %d \nread %d",available,read);
        System.out.printf("%s",read);
        //OutputStream out=Files.newOutputStream(path2);

     }
     
     @Test
     public void t_write() throws IOException {
         OutputStream out=Files.newOutputStream(path1);

      }

}