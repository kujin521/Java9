package chapter.ch03.sec07;

public class ScopeDemo {
    public static void main(String[] args) {
        repeatMessage("Hello", 10);

        for (String arg : args) {
            new Thread(()-> System.out.println(arg)).start();
            //System.out.println(arg);
        }
        //线程不会打印参数
        for (String a : args) 
            new Thread(() -> System.out.println(a));
    }

    public static void repeatMessage(String text, int count) {
        Runnable r = () -> {
           for (int i = 0; i < count; i++) {
              System.out.println(text);
           }
        };
        new Thread(r).start();                  
     }
}
