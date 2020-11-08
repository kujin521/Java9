package chapter.ch03.sec06;

import java.awt.Color;

/**
 * 实现自己的函数式 接口
 */
//注解声明 编译器检查 doc声明
@FunctionalInterface
public interface PixelFunction {
    Color apply(int x, int y);
}