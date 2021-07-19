package java_03_17;

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;
public class binaryTree{
    public static String getMaxSubStr(String str1,String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        int len1 = arr1.length;
        int len2 = arr2.length;
        int start = 0;//最长字串的起始位置
        int maxLen = 0;//最长子串的长度
        int[][] maxSubLen = new int[len1 +1][len2 + 1];
        for(int i = 0; i <= len1; i++){
            for(int j = 0; j <= len2; j++){
                if(arr1[i - 1] == arr2[j - 1]){
                    maxSubLen[i][j] = maxSubLen[i - 1][j - 1] + 1;
                    if(maxLen < maxSubLen[i][j]){
                        maxLen = maxSubLen[i][j];
                        start = i - maxLen;
                    }
                }
            }
        }
        return str1.substring(start,start + maxLen);

    }
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str1;
        String str2;
        while((str1 = reader.readLine()) != null){
            str2 = reader.readLine();
            if(str1.length() < str2.length()){
                System.out.println(getMaxSubStr(str1,str2));
            }else{
                System.out.println(getMaxSubStr(str2,str1));
            }
        }

    }
}




//    public class binaryTree {
//        public static class TreeNode {
//            String val;
//            TreeNode left;
//            TreeNode right;
//
//            public TreeNode(String val) {
//                this.val = val;
//            }
//        }

//
//        //二叉树的层序遍历
//        public static void levelOrder(TreeNode root) {
//            if (root == null) {
//                return;
//            }
//            //二叉树的层序遍历需要借助“队列”来完成
//            //先建立一个队列
//            Queue<TreeNode> queue = new LinkedList<>();
//            //先将根节点入队列
//            queue.offer(root);
//            while (true) {
//                TreeNode cur = queue.poll();
//                if (cur == null) {
//                    break;
//                }
//                //访问这个节点并打印
//                System.out.print(cur.val);
//                //将当前节点的左子树入队列
//                if (cur.left != null) {
//                    queue.offer(cur.left);
//                }
//                    //再将当前节点的右子树入队列
//                    if (cur.right != null) {
//                        queue.offer(cur.right);
//                    }
//                }
//            }
//
//
//            public static TreeNode build () {
//                TreeNode a = new TreeNode("A");
//                TreeNode b = new TreeNode("B");
//                TreeNode c = new TreeNode("C");
//                TreeNode d = new TreeNode("D");
//                TreeNode e = new TreeNode("E");
//                TreeNode f = new TreeNode("F");
//                TreeNode g = new TreeNode("G");
//                TreeNode h = new TreeNode("H");
//                a.left = b;
//                a.right = c;
//                b.left = d;
//                b.right = e;
//                c.left = f;
//                c.right = g;
//                d.right = h;
//                return a;
//            }
//
//        public static void main(String[] args) {
//            TreeNode root = build();
//            levelOrder(root);
//          }
//        }





        //判断一个树是不是完全二叉树

//public static boolean isCompleterTree(TreeNode root) {
//    if (root == null) {
//        return true;
//    }
//    //先对二叉树进行层序遍历
//    Queue<TreeNode> queue = new LinkedList<>();
//    queue.offer(root);
//    while (true) {
//        TreeNode cur = queue.poll();
//        if (cur == null) {
//            break;
//        }
//        //分成两个阶段进行判定
//        //变量为true时，为第一阶段
//        //变量为false时，为第二阶段
//        boolean isLevel = true;
//        if (isLevel) {//第一阶段
//            if (cur.left != null && cur.right != null) {
//                queue.offer(cur.left);
//                queue.offer(cur.right);
//            } else if (cur.left == null && cur.right != null) {
//                return false;
//
//            } else if (cur.left != null && cur.right == null) {
//                isLevel = false;
//                queue.offer(cur.left);
//            } else {
//                isLevel = false;
//            }
//        }
//        else{//第二阶段
//            if (cur.left != null && cur.right != null) {
//                return false;
//            }
//        }//end if
//    }//end while
//
//    return true;
//}
//    }
//
//
//



