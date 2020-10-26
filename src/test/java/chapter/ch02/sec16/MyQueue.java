package chapter.ch02.sec16;

import java.util.ArrayList;

/**
 * MyQueue2
 * 队列
 *
 * @author kujin
 * 创建时间：2020/10/25
 * @version 1
 */
public class MyQueue {
    /**
     * 创建node 节点数组
     */
    private ArrayList<Node> nodes = new ArrayList<>();

    /**
     * 创建节点类
     */
    public static class Node {
        /**
         * 获取节点内容
         * @return 节点数
         */
        public String getContent() {
            return content;
        }

        /**
         * 定义节点内容变量
         */
        private String content;

        /**
         * 构造节点
         */
        public Node() {
            this.content = "";
        }

        /**
         * 设置节点内容
         * @param content
         */
        public Node(String content) {
            this.content = content;
        }
    }

    /**
     * 获取节点数量
     * @return 节点数
     */
    public int size() {
        return nodes.size();
    }

    /**
     * 添加节点
     * @param value 节点值
     */
    public void add(String value) {
        Node node = new Node(value);
        nodes.add(node);
    }

    /**
     * 删除节点
     */
    public void remove() {
        if (nodes.size() > 0) {
            nodes.remove(0);
        }
    }

    /**
     * 打印节点
     * @param i 下标
     */
    public void printValue(int i) {
        if (i>=0 && i < nodes.size()) {
            System.out.println(nodes.get(i).getContent());
        } else {
            System.out.println();
        }
    }
}
