package liu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Node1{
    int val;
    Node1 prev = null;
    Node1 next = null;

public Node1(int val){
    this.val = val;
   }
}
public class MyLinkedList<index> {
    private Node1 head;
    private Node1 Tail;
    private int length = 0;
    public MyLinkedList(){
        head = null;
        Tail = null;
    }
    public int length(){
        return this.length;
    }
    //插入节点
    //头插
    public void addFirst(int val){
        Node1 newNode = new Node1(val);
        //空链表
        if(head == null){
            head = newNode;
            Tail = newNode;
            length++;
            return;
    }
        //非空的情况
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        length++;
        return;
    }
    //尾插
public void addLast(int val) {
    Node1 newNode = new Node1(val);
    if (head == null) {
        head = newNode;
        Tail = newNode;
        length++;
        return;
    }
    //非空的情况
    Tail.next = newNode;
    newNode.prev = Tail;
    Tail = newNode;
    length++;
}
//指定位置插入
public void add(int index,int val) {
    //先处理特殊情况
    if (index < 0 || index > length) {
        return;
    }
    //处理头插
    if (index == 0) {
        addFirst(val);
        return;
    }
//处理尾插
    if (index == length) {
        addLast(val);
    }
    Node1 newNode = new Node1(val);
//考虑一般的情况
//此时需要先找到下标  =>  节点
    Node1 nextNode = getNode(index);
    Node1 prevNode = nextNode.prev;
    prevNode.next = newNode;
    newNode.prev = prevNode;

    newNode.next = nextNode;
    nextNode.prev = newNode;
    length++;
}
public void removeFirst() {
    if (head == null) {
        return;
    }
    if (head.next == null) {
        head = null;
        Tail = null;
        length = 0;
        return;
    }
    //把第一个节点删除掉
    Node1 nextNode = head.next;
    nextNode.prev = null;
    head = nextNode;
    length--;
}
public void removeLast() {
    if (head == null) {
        return;
    }
    if (head.next == null) {
        head = null;
        Tail = null;
        length = 0;
        return;
    }
    Node1 prevNode = Tail.prev;
    prevNode.next = null;
    Tail = prevNode;
    length--;
}
//删除
    public void removeIndex(int index) {
        if (index < 0 || index >= length) {
            return;
        }
        //头插和头删需要修改head和tail
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == length - 1) {
            removeLast();
            return;
        }
        //一般的情况不需要修改head和Tail的指向
        //1.根据下标，找到位置
        Node1 toRemove = getNode(index);
        //2.记录前后节点的位置
        Node1 prevNode = toRemove.prev;
        Node1 nextNode = toRemove.next;
        //3.删除节点
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        length--;
    }
    public void removeByvalue(int val) {
        int index = indexof(val);
        if (index == -1) {
            return;
        }
        removeByIndex(index);
    }

    private void removeByIndex(int index) {
    }

    private int indexof(int val) {
        return 0;
    }
    //根据下标找到节点

    public Node1 getNode(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node1 cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }
    //查找
    public int get(int index){

        if(index < 0 || index >= length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return getNode(index).val;

    }
    public int indexOf(int value){
        Node1 cur = head;
        for(int i = 0; i < length; i++) {
            if (cur.val == value) {
                return i;
            }
            cur = cur.next;
        }
        return -1;
    }
    //修改
    public void set(int index,int value) {
        if (index < 0 || index >= length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node1 node = getNode(index);
        node.val = value;
    }
    public static  void main(string[] args){
        List<String> list = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        linkedList.add("hello");
        linkedList.add(10, "c++");
        linkedList.remove(10);
        linkedList.indexOf("c++");
        linkedList.get(10);

        linkedList.set(10, "java");
        Scanner scanner = new Scanner(System.in);
        scanner.next();


    }

    }