package chapter.ch04.sec01;

/**
 * 在接口中使用default 标识函数可以有方法体
 */
public interface Named {
    default String getName() { return ""; }
}