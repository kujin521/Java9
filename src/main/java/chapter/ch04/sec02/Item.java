package chapter.ch04.sec02;

import java.util.Objects;

/**
 * 了解equals
 * 假设有两个item 他们的描述和价格都相等 我们认为他们是相等的
 */
public class Item {
    private String description;//描述
    private double price;//价格
        
    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    /**
     * overrider
     * @param otherObject
     * @return
     */
    public boolean equals(Object otherObject) {
        // 快速测试以查看对象是否相同
        if (this == otherObject) return true;
        // 如果显式参数为null，则必须返回false
        if (otherObject == null) return false;
        // 检查otherObject是否为Item
        if (getClass() != otherObject.getClass()) return false;
        // 测试实例变量是否具有相同的值
        Item other = (Item) otherObject;
        return Objects.equals(description, other.description)
            && price == other.price;
    }
    
    public int hashCode() {
        return Objects.hash(description, price);
    }
}