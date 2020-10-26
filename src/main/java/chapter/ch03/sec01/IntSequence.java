package chapter.ch03.sec01;

/**
 * 定义一个整数序列接口
 * 接口是双方 约定合同一种机制
 */
public interface IntSequence {
    boolean hasNext();
    int next();
}