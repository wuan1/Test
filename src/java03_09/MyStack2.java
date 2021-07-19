package java03_09;
class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
    }
}
//链表实现栈的一系列操作
public class MyStack2 {
    private Node head = null;
    //头插表示入栈
    public void push(int val){
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
        //头删表示出栈
        public Integer pop() {
            if (head == null) {
                return null;
            }
            if (head.next == null) {
                int ret = head.val;
                head = null;
                return ret;
            }
            int ret = head.val;
            head = head.next;
            return ret;
        }
        //取栈顶元素
    public Integer peek(){
        if(head == null) {
            return null;
        }
        return head.val;
    }



}
