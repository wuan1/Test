package java03_31;
class hashNode{
    public int key;
    public int value;
    public hashNode next;

    public hashNode(int key,int value) {
        this.key = key;
        this.value = value;
    }
}

public class myHashMap {
    private hashNode[] array = new hashNode[16];
    private int size = 0;

    public void put(int key, int value) {
        //先把key转成数组下标
        int index = key % array.length;
        //遍历该位置的链表，看key是不是已经存在了
        //如果key已经存在，就不必插入新节点，直接修改value的值即可
        for (hashNode cur = array[index]; cur != null; cur = cur.next) {
            if (cur.key == key) {
                return;
            }
        }
        hashNode newNode = new hashNode(key, value);
        newNode.next = array[index];
        array[index] = newNode;
        size++;
        if (loadFactor() > 0.75) {
            resize();
        }
    }

    private void resize() {
        hashNode[] newArray = new hashNode[array.length * 2];
        for(int i = 0; i < array.length; i++){
            hashNode next = null;
        for (hashNode cur = array[i] ; cur != null; cur = next) {
            next = cur.next;
            int indexNew = cur.key % newArray.length;
            cur.next = newArray[indexNew];
            newArray[indexNew] = cur;
        }
    }
}
private double loadFactor(){
    return (double)size / array.length;
}
public Integer get(int key) {
    int index = key % array.length;
    for (hashNode cur = array[index]; cur != null; cur = cur.next) {
        if (cur.key == key) {
            return cur.value;
        }
    }
    return null;
  }
}



