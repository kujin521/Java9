package chapter.ch01.sec04;

public class ArithmeticDemo {
    public static void main(String[] args) {
        // Division and remainder
        testFollMod();
        System.out.println(17 / 5); //3
        System.out.println(17 % 5); //2
        System.out.println(Math.floorMod(17, 5)); //2
        //如果该参数的符号相同，结果floorMod和%运算符是相同的。
        //floorMod(4, 3) == 1 ; 和(4 % 3) == 1
        
        System.out.println(-17 / 5); //-3
        System.out.println(-17 % 5); //-2
        System.out.println(Math.floorMod(-17, 5)); //3
        //如果参数的符号不同，结果从不同%操作。
        //floorMod(+4, -3) == -2 ; 和(+4 % -3) == +1
        //floorMod(-4, +3) == +2 ; 和(-4 % +3) == -1
        //floorMod(-4, -3) == -1 ; 和(-4 % -3) == -1

        // Increment and decrement
        
        int[] a = { 17, 29 };
        int n = 0;
        System.out.printf("%d %d\n", a[n++], n); 
        n = 0;
        System.out.printf("%d %d\n", a[++n], n);
        
        // Powers and roots
        
        System.out.println(Math.pow(10, 9));
        System.out.println(Math.sqrt(1000000));
        
        // Number conversions
        
        double x = 42;
        System.out.println(x); // 42.0
        
        float f = 123456789;
        System.out.println(f); // 1.23456792E8
        
        x = 3.75;
        n = (int) x;
        System.out.println(n); // 3
        
        n = (int) Math.round(x); 
        System.out.println(n); // 4
        
        System.out.println('J' + 1); // 75
        char next = (char)('J' + 1); 
        System.out.println(next); // 'K'
        
        n = (int) 3000000000L; 
        System.out.println(n); // -1294967296
    }

    private static void testFollMod() {
        int x=25;
        int y=5;
        yihuyunsuan(x,y);
//        System.out.println(x/y);//5
//        System.out.println(x%y);//0
//        System.out.println(x^y);//28
    }

    /**
     * 可以用于对值的交换
     * @param x
     * @param y
     */
    private static void yihuyunsuan(int x, int y) {
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.printf("x=%d y=%d \n",x,y);
    }
}
