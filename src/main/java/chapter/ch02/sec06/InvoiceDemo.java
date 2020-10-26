package chapter.ch02.sec06;

/**
 * 嵌套类的使用
 */
public class InvoiceDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addItem("Blackwell Toaster", 2, 24.95);
        invoice.addItem("ZapXpress Microwave Oven", 1, 49.95);
        invoice.print();
    }
}
