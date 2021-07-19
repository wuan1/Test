

import java.util.*;
//
public class ceshi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int sum = n;
            while(sum > 9){
                int a = sum % 10;
                int b = sum / 10;
                sum = a + b;
            }
            System.out.println(sum);
        }


    }
}
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        while(scanner.hasNext()){
//            int count = 0;
//            int n = scanner.nextInt();
//            for(int i = 1; i <= n;i++){
//                if(isPerfect(i)){
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }
//    }
//
//
//    public static boolean isPerfect(int n){
//        int sum = 0;
//        int i = 1;
//        for(; i < n; i++){
//            if(n % i == 0){
//                sum += i;
//            }
//        }
//        return sum == i;
//    }
//}







//    public int StrToInt(String str) {
//        char[] ch = str.toCharArray();
//        if(ch == null || ch.length == 0){
//            return 0;
//        }
//        int flag = 1;
//        if(ch[0] =='+'){
//            flag = 1;
//            ch[0] = '0';
//        }else if(ch[0] == '-'){
//            flag = -1;
//            ch[0] = '0';
//        }
//        int sum = 0;
//        for(int i = 0; i < ch.length; i++){
//            if(ch[i] < '0' || ch[i] > '9'){
//                sum = 0;
//                break;
//            }
//            sum = sum * 10 + ch[i] - '0';
//
//        }
//        return flag * sum;
//
//    }
//}
   
//        public static void main(String[] args){
//            Scanner scanner = new Scanner(System.in);
//            while(scanner.hasNext()){
//                String str1 = scanner.nextLine();
//                String str2 = scanner.nextLine();
//                StringBuffer str = new StringBuffer(str1);
//                int len = str.length();
//                int count = 0;
//                for(int i = 0; i <= len; i++){
//                    str.insert(i,str2);
//                    StringBuffer tmp = new StringBuffer(str);
//                    StringBuffer str3 = new StringBuffer(tmp.reverse());
//
//                    if(str3.toString().equals(str.toString())){
//                        count++;
//                    }
//                }
//                System.out.println(count);
//            }
//        }
//    }
//




//n个数里最小的k个
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int c = scanner.nextInt();
//            int d = scanner.nextInt();
//
//
//            int A = (a + c) / 2;
//            int B1 = (c - a) / 2;
//            int B2 = (b + d) / 2;
//            int C = (d - b) / 2;
//            if (B1 != B2) {
//                System.out.println("No");
//            } else {
//                System.out.println(A + " " + B1 + " " + C);
//            }
//        }
//    }
//}



          //删数

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextInt()) {
//            int n = scanner.nextInt();
//            if (n > 1000) {
//                n = 999;
//            }
//            List<Integer> list = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                list.add(i);
//            }
//            int i = 0;
//            while (list.size() > 1) {
//                i = (i + 2) % list.size();
//                list.remove(i);
//            }
//            System.out.println(list.get(0));
//        }
//    }
//}




        //数组中出现次数超过一半的数字
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        Arrays.sort(arr);
//        int len = arr.length;
//        int midNum = arr[len / 2];
//        int count = 0;
//        for (int i = 0; i < len; i++) {
//            if (arr[i] == midNum) {
//                count++;
//            }
//        }
//        if (count > len / 2) {
//            return midNum;
//        }
//        return 0;
//    }
//}




        //字符串中找出连续最长的数字串
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        String cur = "";
//        String ret = "";
//        int i = 0;
//        for (; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (i >= '0' && i <= '9') {
//                cur = cur + ch + "";
//            } else {
//                if (cur.length() > ret.length()) {
//                    ret = cur;
//                } else {
//                    cur = "";
//                }
//            }
//        }
//        if (i == str.length() && cur.length() > ret.length()) {
//            ret = cur;
//        }
//        System.out.println(ret);
//    }
//}

    //进制转换
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextInt()) {
//            int M = scanner.nextInt();
//            int N = scanner.nextInt();
//            if (N == 2) {
//                System.out.println(Integer.toBinaryString(M));
//            }
//            if (N == 8) {
//                System.out.println(Integer.toOctalString(M));
//            }
//            if (N == 16) {
//                System.out.println(Integer.toHexString(M));
//            }
//        }
//    }
//}




    //计算糖果
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int x1, x2, x3, x4;
//        float A, B, C;
//        while (scanner.hasNext()) {
//            x1 = scanner.nextInt();
//            x2 = scanner.nextInt();
//            x3 = scanner.nextInt();
//            x4 = scanner.nextInt();
//            A = (x1 + x3) / 2f;
//            B = (x2 + x4) / 2f;
//            C = (x4 - x2) / 2f;
//            if (A - (x1 + x3) / 2f != 0) {
//                System.out.println("No");
//            }
//            if (B - (x2 + x4) / 2f != 0) {
//                System.out.println("No");
//            }
//            if (C - (x4 - x2) / 2f != 0) {
//                System.out.println("No");
//            }
//            System.out.print((int) A + " " + (int) B + " " + (int) C);
//        }
//    }
//
//}




    //删除公共字符
//    public static void main(String[] args){
//
//
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String str1 = scanner.nextLine();
//            String str2 = scanner.nextLine();
//            HashMap<Character, Integer> map = new HashMap<>();
//            //1.遍历第二个字符串
//            for (int i = 0; i < str2.length(); i++) {
//                if (map.get(str2.charAt(i)) == null) {
//                    map.put(str2.charAt(i), 1);
//                } else {
//                    map.put(str2.charAt(i), map.get(str2.charAt(i)) + 1);
//                }
//            }
//            String ret = "";
//            //2.遍历第一个字符串
//            for (int i = 0; i < str1.length(); i++) {
//                if (map.get(str1.charAt(i)) == null) {
//                    ret += str1.charAt(i);
//                }
//            }
//            System.out.println(ret);
//        }
//    }
//}




//    //组队竞赛
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            int n = scanner.nextInt();
//            int[] arr = new int[3 * n];
//            long sum = 0;
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = scanner.nextInt();
//            }
//            Arrays.sort(arr);
//            for (int i = 0; i < n; i++) {
//                sum += arr[arr.length - 2 * (i + 1)];
//            }
//            System.out.println(sum);
//        }
//    }
//}

//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String str = scanner.nextLine();
//            int count = 0;
//            int maxLong = 0;
//            int end = 0;
//            for (int i = 0; i < str.length(); i++) {
//
//                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//                    count++;
//                    if (maxLong < count) {
//                        maxLong = count;
//                        end = i;
//                    }
//                } else {
//                    count = 0;
//
//                }
//
//            }
//            System.out.print(str.substring(end - maxLong + 1,end + 1));
//
//        }
//    }
//}



//

         //删除公共字符
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            char[] ch = scanner.nextLine().toCharArray();
//            String str = scanner.nextLine();
//            for (int i = 0; i < ch.length; i++) {
//                if (!str.contains(String.valueOf(ch[i]))) {
//                    System.out.print(ch[i]);
//                }
//            }
//        }
//    }
//}


