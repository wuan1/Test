import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.min;

public class Test0709 {
    public static void main(String[] args) {
        //int 转 String
        // 1.使用“+” 进行字符串拼接
//        int num1 = 10;
//        int num2 = 20;
//        String str = "hello ";
//        String ret = str + (num1 + num2);
//        System.out.println(ret);

        //2.使用String.valueOf()
//        int num = 10;
//        String ret = String.valueOf(num);
//        System.out.println(ret);

        //String 转int 使用 Integer.parseInt()
//        String str = "10";
//        int ret = Integer.parseInt(str);
//        System.out.println(ret);


//        int num = -9;
//        System.out.println(num);
//        int num2 = 0;
//         System.out.println(num / num2);


//        int a = 10;
//        //int ret = a++;  //后++ 是先赋值再++
//        int ret = ++a;    //前++是先++，再赋值
//        System.out.println(a);
//        System.out.println(ret);

        // ~ 按位取反
//        int num = 10;
//        System.out.printf("%x\n",~num);  //按位取反  0变1，1变 0


        //交换两个值

        //1.临时变量
//        int a = 20;
//        int b = 10;
//        int tmp = a;
//         a = b;
//         b =tmp;
//        System.out.println(a);
//        System.out.println(b);


        //2.不使用临时变量  +-
//        int a = 20;
//        int b = 10;
//        a = a + b;  // 30 10
//        b = a - b; //  30 20
//        a = a - b; //  10 20
//        System.out.println(a);
//        System.out.println(b);


        //异或
//        int a = 20;   // 10100
//        int b = 10;   // 01010
//        a = a ^ b;    // 11110  01010
//        b = a ^ b;    //11110   10100
//        a = a ^ b;    // 01010 10100
//        System.out.println(a);
//        System.out.println(b);

//        int a = 10;
//        System.out.println(a >>> 1);


//        int a = 10;
//        int b = 20;
//        System.out.println(a > b ? a : b);


        //判断一个数是奇数还是偶数
//        int num = 11;
//        if(num % 2 == 0) {
//            System.out.println("偶数");
//        }else {
//            System.out.println("奇数");
//        }


        //判断一个数是正数还是负数
//        int num = 10;
//        if(num > 0){
//            System.out.println("正数");
//        }else if(num == 0){
//            System.out.println("非正非负");
//        }else{
//            System.out.println("负数");
//        }


        //判断某一个年份是否是闰年
//        int year = 2008;
//        if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0){
//            System.out.println("闰年");
//        }else{
//            System.out.println("平年");
//        }

        //switch case 语句
//        int day = 8;
//        switch(day) {
//            case 1:
//                System.out.println("星期一");
//                break;
//            case 2:
//                System.out.println("星期二");
//                break;
//            case 3:
//                System.out.println("星期三");
//                break;
//            case 4:
//                System.out.println("星期四");
//                break;
//            case 5:
//                System.out.println("星期五");
//                break;
//            case 6:
//                System.out.println("星期六");
//                break;
//            case 7:
//                System.out.println("星期日");
//                break;
//            default:
//                System.out.println("星期8");
//        }


        //打印1-10 的数字
//        int num = 0;
//        while(num < 10){
//            num++;
//            System.out.println(num);
//        }

//        int num = 0;
//        for(num = 1; num <= 10; num++){
//            System.out.println(num);
//        }

        //计算1-100的和
//        int num = 1;
//        int ret = 0;
//        while(num <= 100){
//            ret += num;
//            num++;
//        }
//        System.out.println(ret);


//        int num = 1;
//        int ret = 0;
//        for(num = 1; num <= 100; num++){
//            ret += num;
//        }
//        System.out.println(ret);

        //计算5的阶乘
//        int num = 1;
//        int ret = 1;
//        while(num <= 5){
//            ret *= num;
//            num++;
//        }
//        System.out.println(ret);

        //计算1！+2！+3！+4！+5！
//       int ret = 0;
//       int num = 1;
//       //外层循环用于阶乘相加
//        while(num <= 5){
//            int tmp = 1;
//            int i = 1;
//            //里层循环用于求阶乘
//            while(i <= num){
//                tmp *= i;
//                i++;
//            }
//            ret += tmp;
//            num++;
//        }
//        System.out.println(ret);

//        int ret = 0;
//        int num = 1;
//        for(num = 1; num <= 5; num++){
//            int facRet = 1;
//            int i = 1;
//            for(i = 1; i <= num; i++){
//                facRet *= i;
//            }
//            ret += facRet;
//
//        }
//        System.out.println(ret);


        //吃包子 5个
//        int num = 1;
//        while(num <= 5){
//            if(num == 3){
//                num++;
//                continue;
//            }
//            System.out.println("吃第 "+ num + "个包子");
//            num++;
//        }


        //计算1-100 的和
//        int ret = 0;
//        for(int i = 1; i <= 100; i++){
//            ret += i;
//        }
//        System.out.println(ret);

        //打印1-10

//        int num = 1;
//        do{
//            System.out.println(num);
//            num++;
//        }while(num <= 10);


        //猜数字小游戏
//        Scanner scanner = new Scanner(System.in);
//        int guessNum = new Random().nextInt(100) + 1;
//        System.out.println("请输入你想输入的数字");
//        while(scanner.hasNext()){
//            int num = scanner.nextInt();
//            if(num < guessNum){
//                System.out.println("猜小了");
//            }else if(num > guessNum){
//                System.out.println("猜大了");
//            }else{
//                System.out.println("猜对了");
//                break;
//            }


        //需要用户输入若干个整数， 求和
        //ctrl + d 结束进程
//        int sum = 0;
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()){
//            int num = scanner.nextInt();
//            sum += num;
//        }
//        System.out.println(sum);


        //计算一个整数中1的个数
        // 只适用于正数
//        int num = 1;
//        int count = 0;
//        while(num != 0){
//            if((num & 1) == 1){
//                count++;
//            }
//            num >>= 1;
//        }
//        System.out.println(count);

//正数负数都可以
//        int count = 0;
//        int num = 10;
//        while(num != 0){
//            num = num & (num - 1);
//            count++;
//        }
//        System.out.println(count);

        //打印1-100之间的所有素数
//        for(int i = 1;i <= 100; i++){
//            if(isPrime(i)){
//                System.out.println(i);
//            }
//        }
//
//    }
//
//        //判断一个数是否是素数
//        public static Boolean isPrime(int num){
//            if(num == 1 || num == 0){
//                return false;
//            }
//            for(int i = 2;i < num; i++){
//                if(num % i == 0){
//                    return false;
//                }
//            }
//            return true;
//        }
        //判断1000-2000年之间的所有闰年
//        for(int year = 1000; year <= 2000; year++){
//            if(isRunYear(year)){
//                System.out.println(year);
//            }
//        }
//    }
//
//        public static Boolean isRunYear(int year){
//        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
//            return true;
//        }
//        return false;
//    }

        //打印九九乘法表
//        printMultiplicationTable(9,9);
//    }
//
//   public static void printMultiplicationTable(int row,int col) {
//        for( row = 1; row <= 9; row++){
//            printLine(row);
//        }
//    }
//
//    public static void printLine(int row) {
//        for(int col = 1; col <= row; col++){
//            System.out.print(col + "x" + row + "=" + row*col + " ");
//        }
//        System.out.println();


        //求两个整数的最大公约数
//        int result = gcd(100,60);
//        System.out.println(result);
//    }
//
//   public static int gcd(int a, int b) {
//        while(b != 0){
//            int c = a % b;
//            a = b;
//            b = c;
//        }
//        return a;

//        int result = gcd(100,60);
//        System.out.println(result);
//
//    }

//    private static int gcd(int a, int b) {
//        int min = min(a,b);
//        for(int i = min; i >= 1;i--){
//            if(a % i == 0 && b % i == 0){
//                return i;
//            }
//        }
//        return 1;


        //求数列的值
        //1/1 - 1/2 + 1/3 - 1/4 + 1/5 - 1/6 + ....+1/(n - 1) - 1/n(n一定是偶数）
//        double result = calcSeries(2);
//        System.out.println(result);
//    }
//
//    public static double calcSeries(int bound) {
//        //这个方法中只考虑项与项之间的求和
//        double result = 0;
//        for(int i = 2; i <= bound; i += 2){
//            result += calcItem(i);
//        }
//        return result;
//    }
//     //计算两项相减
//    public static double calcItem(int i) {
//        return 1.0/ (i - 1) - 1.0 / i;
//    }


        //计算1-100之间的数中有几个9
//        int count = sum(1,100);
//        System.out.println(count);
//    }
//
//   public static int sum(int begin, int end) {
//        int count = 0;
//        for(int i = begin; i <= end; i++){
//            if(i % 10 == 9){
//                count++;
//            }
//            if(i / 10 == 9){
//                count++;
//            }
//
//       }
//        return count;
//    }


        //计算 0 - 999 之间的所有水仙花数

//        printAllFlowernum(0,999);
//    }
//       //打印所有的水仙花数
//    public static void printAllFlowernum(int begin,int end) {
//        for(int i = begin; i <= end; i++){
//            if(isFlowerNum(i)){
//                System.out.println(i);
//            }
//        }
//    }
//     //判断是否是水仙花数
//    public static Boolean isFlowerNum(int n) {
//        int ge = n % 10;
//        int tmp = n / 10;
//        int shi = tmp % 10;
//        tmp = n / 10 / 10;
//        int bai = tmp % 10;
//       if(cube(ge) + cube(shi) + cube(bai) == n) {
//           return true;
//       }
//       return false;
//}
//    // 计算一个数的立方
//    public static int cube(int num) {
//        return num * num * num;
    }
}



