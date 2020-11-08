package chapter.ch04.sec02;

/**
 * 邮箱消息类
 * 关于拷贝 Clone
 *
 */
public class Manager extends Employee {
    private double bonus;
    
    public Manager(String name, double salary) {
        super(name, salary);
        bonus = 0;
    }
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double getSalary() { // 覆盖超类方法
        return super.getSalary() + bonus;
    }
    
    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }
    
    public Manager clone() throws CloneNotSupportedException {
        return (Manager) super.clone();
    }
} 