package chapter.ch04.sec01;

/**
 * 经理 继承 员工
 *
 */
public class Manager extends Employee {
    private double bonus;//新增奖金
    
    public Manager(String name, double salary) {
        super(name, salary);
        bonus = 0;
    }
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * overrider 覆写
     * @return
     */
    public double getSalary() { // Overrides superclass method
        return super.getSalary() + bonus;
    }
} 