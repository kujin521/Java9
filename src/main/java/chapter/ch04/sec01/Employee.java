package chapter.ch04.sec01;

/**
 * 雇员类
 *
 */
public class Employee extends Object{
    private String name;//员工名
    private double salary;//薪水

    /**
     * 构造函数
     * @param name
     * @param salary
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * 加薪
     * @param byPercent 百分比
     */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;    
    }

    /**
     * 被final修饰的方法 子类不能实现
     * @return
     */
    public final String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return getClass().getName()+"{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
