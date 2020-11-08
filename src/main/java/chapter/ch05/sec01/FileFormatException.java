package chapter.ch05.sec01;

import java.io.IOException;

/**
 * IOException 处理 输入输出异常
 *
 */
public class FileFormatException extends IOException {
    //定义两个 构造函数 无参和有参 函数
    public FileFormatException() {}
    public FileFormatException(String message) {
        super(message);
    }
}