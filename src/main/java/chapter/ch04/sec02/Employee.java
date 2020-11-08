package chapter.ch04.sec02;

/**
 * 关于拷贝
 * 如果实现一个类 有三种情况考虑 是否提供clone方法
 *  继承Clone 什么也不做
 *  实现Cloneable 接口
 */
public class Employee implements  Cloneable{
    private String name;
    private double salary;
        
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;    
    }
    
    public final String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public String toString() {
        return getClass().getName() + "[name=" + name
            + ",salary=" + salary + "]";
    }

    /**
     * 深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}
