package chapter.ch02.sec15;

import java.util.ArrayList;

/**
 * Invoice
 * todo
 *
 * @author kujin
 * 创建时间：2020/10/25
 * @version 1
 */
public class Invoice {
    public void invoice() {
        this.addItem("Tomato", 12, 5);
        Invoice.Item item0 = new Invoice.Item("Potato", 11, 6);
        this.addItem(item0);
        this.printInvoice();
    }
    public static class Item {
        String description;
        int quantity;
        double unitPrice;

        public Item() {
            this("", 0, 0);
        }

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }


        double price() {
            return quantity * unitPrice;
        }
    }

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void printInvoice() {
        for (Item item : items) {
            System.out.print("description: " + item.description + ", ");
            System.out.print("quantity: " + item.quantity + ", ");
            System.out.println("unitPrice: " + item.unitPrice);
        }
    }
}
