package chapter.ch09.sec02;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Demo_Paths
 * todo
 *
 * @author kujin
 * 创建时间：2020/11/9
 * @version 1
 */
public class Demo_Paths {
    /**
     * t_path_api
     */
    @Test
    public void t_path_api(){
        Path p=Paths.get("/a","b","my.txt");
        Path parent = p.getParent();
        Path fileName = p.getFileName();
        Path root = p.getRoot();
        Path first = p.getName(0);
        Path dir = p.subpath(1, p.getNameCount());
        path_out("parent \t filename \t root \t first \t dir",
                parent,fileName,root,first,dir);
    }
    /**
     * t_path
     */
    @Test
    public void t_path(){
        /**
         *  构建一个绝对路径和相对路径, 路径不需要真实存在 只是一个抽象概念
         *  静态方法 Paths.get可以接收一个或多个参数 参数会使用系统分隔符进行连接
         */
        Path absolute= Paths.get("D:\\","test","a.txt");
        Path relative = Paths.get("test", "a.txt");
        path_out("绝对路径 and 相对路径",absolute, relative);

        Path homeDirectory=Paths.get("/home/cay");
        /**
         * 对路经进行组合解析
         * p.resolve(q) 会根据这些规则返回一个路径对象
         * 如果q是绝对路径 则返回结果就是q
         * 否则 根据文件系统的规则 返回结果是 先p后q
         */
        Path abworkPath=homeDirectory.resolve("D:/myapp/work");
        Path reworkPath=homeDirectory.resolve("myapp/work");
        path_out("路径组合或解析: ",abworkPath,reworkPath);

        /**
         * 与resolve 相反的方法 relativize
         * 调用 p.relativize(r) 返回路径对象q
         */
        Path relativize = Paths.get("/home/cay").relativize(Paths.get("/home/fred/myapp"));
        path_out("得到相对路径:",relativize);

        /**
         * normalize方法可以去除冗余
         */

        /**
         * toAbsolutePath 方法返回指定路径的绝对路径
         * 如果参数不是绝对路径 解析会加上 用户路径---JVM被调用的路径
         * 例如 在 a/b/c 下执行一个程序
         * 则Path toAbsolutePath = Paths.get("config").toAbsolutePath();
         * 返回 a/b/c/config
         */
        Path toAbsolutePath = Paths.get("config").toAbsolutePath();
        path_out("获取绝对路径: ",toAbsolutePath);
    }

    /**
     * 输出多个路径
     * @param paths
     */
    private void path_out(String str,Path ...paths) {
        StringBuffer strb=new StringBuffer();
        strb.append(str+"\n");
        for (Path path : paths) {
            strb.append(path+" \t ");
        }
        System.out.println(strb.toString());
    }
}
