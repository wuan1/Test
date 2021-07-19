package java03_09;
class Node1{
    int val;
    Node1 next;
    public Node1(int val){
        this.val = val;
    }

}
//使用链表来完成队列的一系列操作
public class MyQueue {
    private Node1 head = null;
    private Node1 tail = null;

    //尾插操作表示“入队列”
    public boolean offer(int val) {
        Node1 newNode = new Node1(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return true;
        }
        tail.next = newNode;
        tail = tail.next;
        return true;
    }


   //头删操作表示“出队列”
    public Integer poll() {
        if (head == null) {
            return null;
        }
        int ret = head.val;
        if (head.next == null) {
            head = null;
            return ret;
        }
        head = head.next;
        return ret;
    }

    //取队首元素
    public Integer peek() {
        if (head == null) {
            return null;
        }
        return head.val;
    }
}
