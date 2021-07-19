package liu;

public class Test {


    //已知一条链表，不知道其长度的情况下：
    public static Node createList() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        return a;
    }

    public static void main(String[] args) {

        Node head = createList();
        //通过遍历，找到链表中是否包含某个元素。
        int toFind = 3;
        Node cur = head;
        for(;cur !=null;cur =cur.next)

        {
            if (cur.val == toFind) {
                break;
            }
        }
        if(cur !=null)

        {
            System.out.println("找到了");
        }
        else

        {
            System.out.println("没找到");
        }
    }


//
//    //通过遍历，找到链表的第 n 个结点。（链表的长度 >= n)
//        int N = 3;
//        Node cur = head;
//        for (int i = 1; i < N; i++) {
//            cur = cur.next;
//        }
//        System.out.println(cur.val);
//    }
}


//

//


    //已知一条链表，不知道其长度的情况下：
//    public static Node createList() {
//        Node a = new Node(1);
//        Node b = new Node(2);
//        Node c = new Node(3);
//        Node d = new Node(4);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = null;
//        return a;
//    }
//
//    public static void main(String[] args) {
//
//        Node head = createList();
////通过遍历，计算链表中元素的个数。
//        int count = 0;
//        for(Node cur = head;cur != null;cur = cur.next) {
//            count++;
//        }
//        System.out.println(count);
//    }
//}





//public static Node createList() {
//    Node a = new Node(1);
//    Node b = new Node(2);
//    Node c = new Node(3);
//    Node d = new Node(4);
//    a.next = b;
//    b.next = c;
//    c.next = d;
//    d.next = null;
//    return a;
//}
//
//    public static void main(String[] args) {
//        Node head = createList();
//        //通过遍历，打印链表的每个元素。
//        for (Node cur = head; cur != null; cur = cur.next) {
//            System.out.println(cur.val);
//        }
//    }
//}


