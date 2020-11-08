package chapter.ch04.sec01;

/**
 * 继承演示
 *
 */
public class InheritanceDemo {
    public static void main(String[] args) {
        Manager boss = new Manager("Fred", 200000);
        boss.setBonus(10000); // 在子类中定义
        System.out.println(boss.getSalary());

        boss.raiseSalary(5); // 继承超类
        System.out.println(boss.getSalary());

        Employee empl = boss; // 可以转换为超类
        empl.raiseSalary(5); // 仍然可以应用超类方法
        System.out.println(empl.getSalary()); // 致电Manager.getSalary

        Employee employee=new Manager("kujin",100);
        //employee.setBonus(10000); //Employee没有该方法 可以使用下面的转换子类引用
        System.out.println(employee.getSalary());

        if (empl instanceof Manager) {
            Manager mgr = (Manager) empl;
            mgr.setBonus(20000);
        }

    }
}