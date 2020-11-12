package chapter.ch01.sec01;

import org.junit.Test;

import java.math.BigInteger;
import java.util.*;

/**
 * HelloWord
 *
 *
 * @author kujin
 * 创建时间：2020/10/22
 * @version 1
 */
public class HelloWord {
    public static void main(String[] args) {
        //第一个程序 定义函数 使用Jshell工具学习
        System.out.println("Hello,World!");
        System.out.println("Hello,World!".length());
    }

    /**
     * 基本类型
     * 八个基本类型 四个符号整形 两个浮点型 一个char 一个boolean
     *
     * byte 1字节 -128到127
     * short 2字节    -32 768到32 767
     * int  4字节 -2 147 483 648到2 147 483 647(刚超过20亿)
     * long 8字节 -2^63 到 2^63-1
     * 可以通过 MIN_VALUE MAX_VALUE 查看值
     * 比long还大的 是 BigInteger类
     *
     * float 4字节 大约7位小数位有效数字
     * double 8字节  15位有效小数位数字
     *
     * char UTF-16编码单元
     * boolean false true
     */
    @Test
    public void BaseType(){

    }

    /**
     * 变量
     */
    @Test
    public void mvariable(){
        byte b=-128;
        byte b1=127;
        short st=1;
        int i=-2147483648;
        long l=2147483648L;
        BigInteger bigInteger=
                BigInteger.valueOf(2147483648L*2147483648L);
        char c='a';
        boolean bl=false;
        final int a=1;

    }

    /**
     * 算数操作
     * 
     */
    @Test
    public void arithmetic_operations(){
        //基本运算符
        int a=2>>2;//0
        int b=2<<2;//8
        a=++a;//a=1
        b=b++;//b更改的值不会被使用,b=8
        System.out.println(a);
        System.out.println(b);

        //数学方法
        math:{
            Math.abs(-11);//求绝对值 11
            Math.pow(2,2);//指数 4
            Math.sqrt(9);//平方根 3
            break math;
        }

        //关系符 逻辑运算符
        duoyuan:{
            int time=new Random().nextInt(24);
            System.out.println(time<12?"am":"pm"); //三元运算符
        }

    }

    /**
     * 字符串基本操作
     *
     */
    @Test
    public void string(){
        String location="java";
        String greeting="Hello"+location;
        int age=43;
        String output=age+"yes";
        System.out.println("混合连接要注意"+age+1);
        //在大量使用连接字符串操作 使用StringBuilder 效率高
        StringBuilder builder=new StringBuilder();
//        while (more strings){
//            builder.append(next strng);
//        }
//        String result=builder.toString();
        location.startsWith("java");//检查字符串的开头
        location.endsWith("");//结尾
        location.contains("");//包含

        location.indexOf("");
        location.lastIndexOf("");
        location.indexOf("",0);
        location.lastIndexOf("",0);

        location.replace("","");
        location.replaceAll("\\d","");

        location.isEmpty();//是否为空

        location.toUpperCase();
        location.toLowerCase();

        location.trim();//去除前后空格

        //字符编码 现在基本是utf-16 未来可能使用utf-8
        char cn=location.charAt(2);
        int[] codepoints=location.codePoints().toArray();

    }

    /**
     * 输入输出
     */
    @Test
    public void System_input_output(){
        Scanner in=new Scanner(System.in);
        System.out.println("What is your name?");
        String name=in.nextLine();
        System.out.println("hello "+name);

        //格式化输出
        System.out.printf("%8.2f",1000.0/3.0); //  333.33控制台前面多打印了两个空格
        System.out.printf("%s %d %x,%o,%f,%b,%t","字符串",10,16,8,2.5f,false,"1997-09-18");

    }

    /**
     * 控制流
     */
    @Test
    public void control_flow(){
        if (true){
            System.out.println("if语句");
        }else if(false){
            System.out.println("不可能输出的语句");
        }
        int count=5;
        switch (count){
            case 0:
                break;
            case 1:
            case 2:
            case 4:
                break;
            default:
                System.out.println("没有匹配的!");
                break;
        }
        while (count<10){
            count++;
            System.out.println("一直循环");
            break;
        }
        do {
            count++;
            System.out.println("先执行 再判断");
        }while (count<10);

        for (int i = 0; i < count; i++) {
            System.out.println(i);
        }

    }
    /**
     * 数组和数组列表
     */
    @Test
    public void arrays_and_lists_of_arrays(){
        int numbers[]={1,2,3,4,5,6};
        int num=0;
        for (int number : numbers) {
            num+=number;
        }
        //使用一个地址数组 和复制数组
        int[] numbers2=numbers;
        int[] number3= Arrays.copyOf(numbers2,numbers2.length);

        //数组算法
        Arrays.fill(number3,0);
        Arrays.sort(number3);
        Collections.sort(Arrays.asList(number3.clone()), new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return 0;
            }
        });

        //二维数组 杨辉三角
        int n=5;
        int[][] triangle=new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i]=new int[i+1];
            triangle[i][0]=1;
            triangle[i][i]=1;
            for (int j = 1; j < i; j++) {
                triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
            }
        }

        for (int r = 0; r < triangle.length; r++) {
            for (int c = 0; c < triangle[r].length; c++) {
                System.out.printf("%4d",triangle[r][c]);
            }
            System.out.println();
        }
        for (int[] row : triangle) {
            for (int element : row) {
                System.out.printf("%4d",element);
            }
            System.out.println();
        }

    }
    /**
     * 功能分解
     */
    @Test
    public void functional_decomposition(){
        int a=a1("11");
    }

    private int a1(String s) {
        return Integer.parseInt(s);
    }

}
