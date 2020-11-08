package chapter.ch04.sec01;

/**
 * 学生类 继承 抽象类Person 并实现了接口 Named
 *
 */
public class Student extends Person implements Named {
    private int id;

    public Student(String name, int id) { super(name); this.id = id; }
    public int getId() { return id; }
}