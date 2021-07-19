package java03_11;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
import java.util.Stack;


import java.util.*;
//括号匹配问题
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();
        int len = 0;
        if (len1 > len2) {
            len = len1 - len2;
        } else if(len1 <= len2){
            len = len2 - len1;
        }
        System.out.println(len);
    }
}



//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNextInt()){
//            int n = scanner.nextInt();
//            int j = findNumberOf1(n);
//            System.out.println(j);
//        }
//    }
//    public static int findNumberOf1(int num){
//        String str = Integer.toBinaryString(num);
//        int count = 0;
//        for(int i = 0; i < str.length(); i++){
//            if(str.charAt(i) == '1'){
//                count++;
//            }
//        }
//        return count;
//    }




//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        ///遍历字符串并取出每个字符
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//            //如果是左括号，就把它放入栈中
//            if (c == '[' || c == '(' || c == '{') {
//                stack.push(c);
//                continue;
//            }
//            //在标准库中，若stack为空，进行peek时，则会抛出异常
//            if (stack.isEmpty()) {
//                return false;
//            }
//            //若遇到右括号，把栈顶元素出栈
//            Character top = stack.pop();
//
//            if (top == '[' && c == ']') {
//                continue;
//            }
//            if (top == '(' && c == ')') {
//                continue;
//            }
//            if (top == '{' && c == '}') {
//                continue;
//            }
//            //如果没有找到相应的右括号，就认为是不合法的，返回false
//            return false;
//        }
//            if (stack.isEmpty()) {
//                return true;
//            }
//            return false;
//        }
//    }

