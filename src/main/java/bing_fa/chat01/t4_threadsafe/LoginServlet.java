package bing_fa.chat01.t4_threadsafe;

/**
 * LoginServlet
 * todo
 *
 * @author kujin
 * 创建时间：2020/11/6
 * @version 1
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;

    public static void doPost(String username,String password){
            try {
                usernameRef=username;
                if (username.equals("a")) {
                    Thread.sleep(500);
                }
                passwordRef=password;
                System.out.println("username "+usernameRef+" password ="+password);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
