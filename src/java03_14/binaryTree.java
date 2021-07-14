package java03_14;


import java.util.ArrayList;
import java.util.List;

class TreeNode {
 String val;
    TreeNode left;
    TreeNode right;

    public TreeNode(String val) {
        this.val = val;
    }
}
//class TreeNode1 {
//    int val;
//    TreeNode1 left;
//    TreeNode1 right;
//
//    public TreeNode1(int val) {
//        this.val = val;
//    }
//}

public class binaryTree {

    public static TreeNode build() {
        TreeNode a = new TreeNode("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        TreeNode d = new TreeNode("D");
        TreeNode e = new TreeNode("E");
        TreeNode f = new TreeNode("F");
        TreeNode g = new TreeNode("G");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        return a;


    }

    //    public List<Integer> preorderTraversal(TreeNode1 root) {
//        List<Integer> result = new ArrayList<>();
//        if(root == null) {
//            return result;
//        }
//        result.add(root.val);
//        result.addAll(preorderTraversal(root.left));
//        result.addAll(preorderTraversal(root.right));
//        return result;
//    }


    //求节点个数
    public static int length(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + length(root.left) + length(root.right);
    }
    //第二种方法
    public static int count = 0;
    public static void length1(TreeNode root) {
        if (root == null) {
            return;
        }
        //访问根节点 用count来计数
        count++;
        //递归遍历左子树
        length1(root.left);
        //递归遍历右子树
        length1(root.right);

    }



    //求叶子节点个数
    public static  int leafSize = 0;
    public static  void getLeafSize(TreeNode root){
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            leafSize++;
        }
         getLeafSize(root.left);
         getLeafSize(root.right);
    }

    //第二种方法
    public static int getLeafSize1(TreeNode root){
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize1(root.left) + getLeafSize1(root.right);
    }

    //求第k层节点的个数

    public static int getKLevelSize(TreeNode root,int k){
        if(root == null || k < 1) {
            return 0;
        }
        if(k == 1) {//k==1,表示在第一层，节点个数一定是1
            return 1;
        }
        return getKLevelSize(root.left,k-1) + getKLevelSize(root.right,k-1);

    }


    //查找结点
    public static TreeNode Find(TreeNode root,String toFind){
        if(root == null) {
            return null;
        }
        if(root.val.equals(toFind)) {
            return root;
        }
        //遍历左子树
        TreeNode ret = Find(root.left,toFind);
        if(ret != null) {
            return ret;
        }
        return Find(root.right,toFind);
    }

    //求二叉树的高度
    public static int getHeight(TreeNode root){
        if(root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);

    }




    public static void main(String[] args) {
        TreeNode root = build();
//        int ret = length(root);
//        System.out.println(ret);
        length1(root);
        System.out.println(count);
//        getLeafSize(root);
//        System.out.println(leafSize);
        System.out.println(getLeafSize1(root));
        System.out.println(getKLevelSize(root,2));

        System.out.println(getHeight(root));
    }
}
