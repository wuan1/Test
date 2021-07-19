package java03_31;
class binaryNode{
    public int key;
    public int value;
    public binaryNode left;
    public binaryNode right;

    public binaryNode(int key,int value) {
        this.key = key;
        this.value = value;
    }
}

public class BinarySearchTree {
    //空树就使用null表示
    private binaryNode root = null;
    public Integer get(int key){
        //创建一个引用cur从root出发
        //比较key和cur.key之间的大小关系，设定下一步往哪个方向找
        binaryNode cur = root;
        while(cur != null){
            if(key < cur.key) {
                //从左子树方向找
                cur = cur.left;
            } else if(key > cur.key) {
                //从右子树方向找
                cur = cur.right;
            }
            else {
                return cur.value;
            }
    }
        //没有找到匹配的key
        return null;
}
//插入节点
public void put(int key,int value) {
    if (root == null) {
        //直接把新节点挂到root上就好了
        root = new binaryNode(key, value);
        return;
    }
    //创建一个cur从root出发，找到一个合适的插入位置
    binaryNode cur = root;
    binaryNode parent = null;
    while (cur != null) {
        if (key < cur.key) {
            parent = cur;
            cur = cur.left;
        } else if (key > cur.key) {
            parent = cur;
            cur = cur.right;
        } else {
            //当key相同的时候，并不真正插入新节点
            //而是用value来替换旧的结点的值
            cur.value = value;
            return;
        }
    }
    //当循环结束，cur就为空，说明已经找到了要插入的位置
    //cur为null的时候说明新节点要插入到parent下面
    binaryNode newNode = new binaryNode(key, value);
    if (newNode.key < parent.key) {
        parent.left = newNode;
    } else {
        parent.right = newNode;
    }
}
//删除节点
    public void remove(int key) {
        //先找到待删除结点的位置，也需要同步记录该节点的父节点位置
        binaryNode cur = root;
        binaryNode parent = null;
        while (cur != null) {
            if (key < cur.key) {
                //从左侧找
                parent = cur;
                cur = cur.left;
            } else if (key > cur.key) {
                //从右侧找
                parent = cur;
                cur = cur.right;
            } else {
                removeNode(parent, cur);
                return;
            }
        }
    }
    //由于当前的removeNode方法只是给类自己的remove方法来使用
    //没有其他用途了，就不该暴漏到类的外部
    private void removeNode(binaryNode parent,binaryNode cur){
        if(cur.left == null) {
            //待删除结点的左子树为null
            if (cur == root) {
                //待删除结点正是根节点
                root = cur.right;
            } else if (cur == parent.left) {
                parent.left = cur.right;
            } else if (cur == parent.right) {
                parent.right = cur.right;
            }
        }else if(cur.right == null) {
            if (cur == root) {
                root = cur.left;
            } else if (cur == parent.left) {
                parent.left = cur.left;
            } else if (cur == parent.right) {
                parent.right = cur.left;
            }
        }else {
            //左右子树都存在的情况下
            //需要在右子树中找到最小值，作为替罪羊节点
            //把替罪羊节点的key，value赋值给待删除结点
            //再删除替罪羊节点即可
            binaryNode goat = cur.right;
            binaryNode goatParent = cur;
            while (goat.left != null) {
                goatParent = goat;
                goat = goat.left;
            }
            cur.key = goat.key;
            cur.value = goat.value;
            //删除替罪羊节点，根据替罪羊是左右子树，分别采取不同的方法
            if (goat == goatParent.left) {
                goatParent.left = goat.right;
            } else {
                goatParent.right = goat.right;
            }
        }
    }
}
