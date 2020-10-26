package chapter.ch02;

/**
 * Point
 * 描述平面上的点 不可修改的Point类
 * 提供一个具体点的构造函数
 * 一个原点的无参构造函数, 以及get/set translate(平移) scale(按比例变换)
 *
 * @author kujin
 * 创建时间：2020/10/24
 * @version 1
 */
public class Point_static {
    public void start() {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println("the point is: (" + p.getX() + "," + p.getY() + ")");
    }
    /**
     * 一个 <code>Point</code> 对象代表一个坐标点
     * 坐标点中包含该坐标对应的横坐标的值 x 以及纵坐标的值 y
     * @author kujin
     * @version 1.0
     */
    public static class Point{
        private double x;
        private double y;

        /**
         * 使用给定的 x 和 y 值构造一个坐标点对象
         * @param x 横坐标的值
         * @param y 纵坐标的值
         */
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        /**
         * 使用原点构造一个坐标点对象
         */
        public Point() {
            this(0,0);
        }

        /**
         * 获取横坐标的值
         * @return 返回 double 类型的横坐标的值
         */
        public double getX() {
            return x;
        }
        /**
         * 获取纵坐标的值
         * @return 返回 double 类型的纵坐标的值
         */
        public double getY() {
            return y;
        }
        /**
         * 获取相对原坐标点移动之后的坐标点，该方法不改变原有坐标点的状态
         * @param x 横坐标的移动量
         * @param y 纵坐标的移动量
         * @return 返回移动之后的坐标点
         */
        public Point translate(double x,double y){
            return new Point(this.x+x,this.y+y);
        }

        /**
         * 获取相对原坐标点缩放之后的坐标点，该方法不改变原有坐标点的状态
         * @param s 缩放因子
         * @return 返回缩放之后的坐标点
         */
        public Point scale(double s){
            return new Point(this.x*s,this.y*s);
        }
        /**
         * 将坐标点按照给定的横纵坐标值进行移动
         * @param x 横坐标的移动量
         * @param y 纵坐标的移动量
         */
        public void setTranslate(double x, double y) {
            this.x += x;
            this.y += y;
        }
        /**
         * 将坐标点按照给定的缩放因子值进行缩放
         * @param s 缩放因子
         */
        public void setScale(double s) {
            this.x *= s;
            this.y *= s;
        }
    }

}
