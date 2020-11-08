package chapter.ch04.sec01;

/**
 * 抽象类
 * 不能被实例化, 强制有子类去实现方法
 */
public abstract class Person {
    private String name;

    public Person(String name) { this.name = name; }

    /**
     * final 不能被实现
     * @return
     */
    public final String getName() { return name; }

    /**
     * 抽象方法 没有方法体 子类必须实现 否则他也是抽象类
     *
     * @return
     */
    public abstract int getId();
}