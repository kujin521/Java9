package chapter.ch05;

import java.io.File;
import java.io.IOException;

/**
 * Exercises1
 * 写一个方法 public ArrayList<Double>readValues(String filename) throws...
 * 该方法可以读取一个包含浮点数字的文件
 * 如果文件不能打开或则输入不能是浮点数字时, 则抛出适当异常
 * @author kujin
 * 创建时间：2020/11/8
 * @version 1
 */
public class Exercises1 {
    public static void main(String[] args) {
        readValues("read.txt");
    }

    private static void readValues(String filename) {
        File file=new File(filename);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("创建文件异常");
                e.printStackTrace();
            }
        }

    }

}
