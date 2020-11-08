package chapter.ch04.sec03;

/**
 * 枚举 栗子
 * 对于枚举类型的值 只需要==比较即可
 */
public enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbreviation;//缩写

    /**
     * 必须是私有的构造函数 可以省略不写,只被执行一次
     * @param abbreviation
     */
    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
     * 方法
     * @return
     */
    public String getAbbreviation() { return abbreviation; }
}