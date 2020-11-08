package chapter.ch04.sec02;

import java.util.ArrayList;

/**
 * 邮箱消息类
 * ArrayList 类实现了Clone方法 产生一个浅拷贝对象
 * 源列表和克隆列表共享元素引用
 */
public final class Message {
    private String sender;//发件人
    private ArrayList<String> recipients;//收件人s
    private String text;//内容


    /**
     * 初始化构造函数
     * @param sender
     * @param text
     */
    public Message(String sender, String text) {
        this.sender = sender;
        this.text = text;
        recipients = new ArrayList<>();
    }

    /**
     * 添加收件人
     * @param recipient
     */
    public void addRecipient(String recipient) { 
        recipients.add(recipient);
    };

    /**
     * 拷贝的完整实现
     * @return
     */
    public Message clone() {
        try {
            Message cloned = (Message) super.clone();
            @SuppressWarnings("unchecked") ArrayList<String> clonedRecipients 
                = (ArrayList<String>) recipients.clone();
            cloned.recipients = clonedRecipients; 
            return cloned;
        } catch (CloneNotSupportedException ex) {
            return null;    //不会发生? 应为Message是Cloneable 和final的 并且Arraylist.clone 没有异常抛出
        }
    }
}