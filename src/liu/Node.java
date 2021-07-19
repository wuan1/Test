package liu;

public class Node {
    public int val;
    public Node next = null;
    public Node(int val){
        this.val = val;
    }
    public String toString(){
        return"[" +val+ "]";
    }
}
