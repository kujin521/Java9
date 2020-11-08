package chapter;

import chapter.ch02.sec15.Invoice;
import org.junit.Test;

/**
 * Ch03Test
 * 03课后练习
 *
 * @author kujin
 * 创建时间：2020/10/24
 * @version 1
 */
public class Ch03Test {
    /**
     * exe1
     * 改变日历打印程序，让每周从周日开始。同时让它在结尾新打印一行（并且只新打印一行）
     */
    @Test
    public void exe1(){

    }

    /**
     * exe2
     * 思考一下 Scanner 类的 nextInt 方法。
     * 它是访问器方法还是修改器方法？为什么？那 Random 类的 nextInt 方法呢？
     */
    @Test
    public void exe2(){
        System.out.println("Scanner 类的 nextInt 方法是修改器方法" +
                "，因为它改变了 Scanner 类的状态，使其读取下一个输入。" +
                "Random 类的 nextInt 方法是访问器方法，因为它只是用来返回随机整数，而不会改变 Random 类的状态。\n");
    }
    /**
     * exe3
     * 只用条件操作符，写一个程序，读取三个整数并输出最大的。使用 Math.max 实现同样的功能。
     */
    @Test
    public void exe3(){
    }
    /**
     * exe4
     * 写个程序，输出 double 类型中的最小正数值和最大正数值。
     * 提示：在 Java API 文档中查询 Math.nextUp
     */
    @Test
    public void exe4(){
        System.out.println(Math.nextUp(5.5f));
        System.out.println(Math.nextUp(5.5));
    }
    /**
     * exe5
     * 实现一个描述平面上点的不可能修改的 Point 类。
     * 提供一个设置具体点的构造函数、一个设置为原点的无参数构造函数，
     * 以及方法 getX、getY、translate 和 scale。translate 方法根据给定量在 x 和 y 方向上移动该点。scale 方法根据给定因子在坐标系按比例变化。
     * 实现这些方法以便它们将新的 Point 对象作为结果返回。例如：
     */
    @Test
    public void exe5(){

    }
    /**
     * exe6
     * .重复前面的练习5，但是使得 translate 和 scale 方法变成修改器方法。
     */
    @Test
    public void exe6(){
    }
    
    /**
     * exe7
     * 给前面两个版本的 Point 类添加 javadoc 注释。
     */
    @Test
    public void exe7(){

    }
    /**
     * exe8
     * 在前面的练习中，提供的 Point 类的这些构造函数和 getter 方法有些重复。
     * 大多数 IDE 为编写样板代码都提供了快捷方式。你的 IDE 都提供了哪些？
     * alt+insert
     */
    @Test
    public void exe8(){
        //alt+insert
    }
    
    /**
     * exe9
     * .实现一个 Car 类，模拟汽车沿着 x 轴移动，随着移动消耗燃油。
     * 提供一个按照给定英里数驱动汽车的方法、给汽车燃料箱添加给定加仑（燃油）的方法，以及获取原点到油位的当前距离的方法。
     * 在构造函数中指定燃料效率（单位为每加仑多少英里）。Car 类应该是不可修改类吗？为什么或者为什么不应该？
     */
    @Test
    public void exe9(){

    }
    /**
     * exe10
     * 在 RandomNumbers 类中，提供两个静态方法 randomElement，
     * 从数组或者整数数组列表中获得随机元素。（如果数组或者数组列表为空，则返回 0。）
     * 为什么不能使这两个方法成为 int [] 或 ArrayList<Integer> 的实例方法？
     */
    @Test
    public void exe10(){

    }
    
    /**
     * exe11
     * 对 System 和 LocalDate 类使用静态导入，重写 Cal 类。
     */
    @Test
    public void exe11(){

    }
    /**
     * exe12
     * 创建一个 HelloWorld.java 文件，它在包 ch01.sec01 中声明了 HelloWorld 类。
     * 把它放在某个目录，但不在 ch01/sec01 子目录。从存放文件的那个目录运行 javac HelloWorld.java。
     * 你会得到类文件吗？类文件存放在哪里？
     * 接着运行 java HelloWorld 会发生什么？
     * 为什么？（提示：运行 javap HelloWorld 并研究告警信息。）
     * 最后，为什么 javac -d . HelloWorld.java 更好？
     *
     * 会得到类文件，文件存放在 HelloWorld.java 所在的目录
     */
    @Test
    public void exe12(){
        //todo
        
    }
    /**
     * exe13
     * 从 http://opencsv.sourceforge.net 下载 OpenCSV 的 JAR 文件。
     * 写个有 main 方法的类，读取你选择的 CSV 文件并打印部分内容。OpenCSV 网站上有示例代码。
     * 我们还未学习处理异常。先用下面的内容作为 main 方法头：
     *
     * 这个练习的目的不是让我们用 CSV 文件做些有用的事情，
     * 而是练习如何使用交付为 JAR 文件格式的类库。
     */
    @Test
    public void exe13() throws Exception {
    }




    /**
     * exe14
     * 编译 Network 类。注意内部类文件被命名为 Network$Member.class。
     * 使用 javap 程序检查生成的代码。命令
     *
     * javap -private Classname
     * 显示方法和实例变量。你在哪里看到外部类的引用？
     * （在 Linux/Mac OS X 系统上，运行 javap 时，在 $ 符号前你需要输入 “\”。）
     */
    @Test
    public void exe14(){
        //todo
        
    }
    /**
     * exe15
     * 完整实现 2.6.1 节中的 Invoice 类。
     * 提供一个打印 invoice 的方法，以及构造并打印示例 invoice 的演示程序。
     */
    @Test
    public void exe15(){
        new Invoice().invoice();
    }
    
    /**
     * exe16
     *
     */
    @Test
    public void exe16(){

    }
    /**
     * exe17
     *
     */
    @Test
    public void exe17(){

    }
}
