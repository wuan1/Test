package java_03_17;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class createTree {
    //二叉树的构建及遍历
//    public static class TreeNode {
//        char val;
//       TreeNode left;
//       TreeNode right;
//
//        public TreeNode(char val) {
//           this.val = val;
//        }
//    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()) {
//            String line = scanner.next();
//            TreeNode root = build(line);
//            inOrder(root);
//            System.out.println();
//        }
//
//
//    }
//    public static int index = 0;
//    public static TreeNode build(String input) {
//        char ch = input.charAt(index);
//        if(ch == '#') {
//            return null;
//        }
//        TreeNode root = new TreeNode(ch);
//        index++;
//        root.left = build(input);
//        index++;
//        root.right = build(input);
//        return root;
//
//    }
//
//    public static void inOrder(TreeNode root){
//            if (root == null) {
//                return;
//            }
//            inOrder(root.left);
//            System.out.print(root.val + " ");
//            inOrder(root.right);
//        }
//}

            //二叉树的分层遍历
//    public static List<List<Integer>> result = new ArrayList<>();
//
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        // 为了保证多组用例之间不干扰, 需要把这个 result 每次重新初始化
//        result = new ArrayList<>();
//        if (root == null) {
//            return result;
//        }
//        helper(root, 0);
//        return result;
//    }
//
//    public void helper(TreeNode root, int level) {
//        if (level == result.size()) {
//            result.add(new ArrayList<>());
//        }
//        result.get(level).add(root.val);
//        if (root.left != null) {
//            helper(root.left, level + 1);
//        }
//        if (root.right != null) {
//            helper(root.right, level + 1);
//        }
//    }


             //非递归 先序遍历
    public static void preOrderByLoop(TreeNode root){
        if(root == null) {
            return;
        }
        //创建一个栈
        Stack<TreeNode> stack = new Stack<>();
        //把根节点入栈
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            System.out.print(cur.val);
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }

    }


    //非递归，中序遍历
    public static void inorderByLoop(TreeNode root){
        if(root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;
        while(true) {
            //里层循环负责cur往左走并入栈这件事
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            if (stack.isEmpty()) {
                //遍历完了
                break;
            }
            TreeNode top = stack.pop();
            System.out.print(top.val);
            //让cur从top的右子树出发重复上述
            cur = top.right;
        }

    }


    public static void postorderByLoop(TreeNode root){
        if(root == null) {
            return;
        }
        //1.创建一个栈
        Stack<TreeNode> stack = new Stack<>();
        //2.创建一个引用cur，从root出发
        TreeNode cur = root;
        //使用prev表示遍历结果的前一个元素
        TreeNode prev = null;
        while(true) {
            //让cur往左走，遇到非空节点就入栈
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            //取出栈顶元素判定能不能访问
            if (stack.isEmpty()) {
                break;
            }
            TreeNode top = stack.peek();
            if (top.right == null || top.right == prev) {
                System.out.print(top.val);
                stack.pop();
                prev = top;
            } else {
                cur = top.right;
            }
        }
    }



    public static TreeNode build() {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        d.right = h;
        return a;
    }


    public static void main(String[] args) {
        TreeNode root = build();
        preOrderByLoop(root);
        System.out.println();
        inorderByLoop(root);
        System.out.println();
        postorderByLoop(root);



    }
}





