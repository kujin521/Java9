package chapter.ch04.sec03;

/**
 * 枚举类 可拥有静态成员
 * 注意: 枚举常量在静态成员之前构建 因此你不能在构造函数之前引用任何静态成员
 */
public enum Modifier {
    PUBLIC, PRIVATE, PROTECTED, STATIC, FINAL, ABSTRACT;
    private int mask;

    static {
        int maskBit = 1;
        for (Modifier m : Modifier.values()) {
            m.mask = maskBit;
            maskBit *= 2; 
        }
    }
    
    public int getMask() {
        return mask;
    }
}