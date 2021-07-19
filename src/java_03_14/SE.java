package java_03_14;

import java.util.Random;
import java.util.Scanner;

public class SE {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        //条件运算符
//        System.out.println(a > b ? a : b);

        //借用临时变量交换a和b
//        int tmp = a;
//        a = b;
//        b = tmp;

        //加法交换a和b
//        a = a + b;
//        b = a - b;
//        a = a - b;


        //异或交换a和b
        //a ^ b ^ b = a
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;

//        System.out.println("a = " + a + ", b ="+ b);

        //&& 短路求值，它前面为false时，就不计算后面，直接为false
//        System.out.println(a > b && a / 0 == 0);
//        //& 是二进制位按位与
//
//        System.out.println(a & b);
//        ///~ 按位取反
//        System.out.printf("%x",~a);
//        System.out.println( );
//        //按位异或   相同为0，相异为1
//        System.out.println(a ^ b);
//        System.out.println(a < b && a / 0 == 0);


//            int  num = 10;
//            //左移一位相当于*2
//        System.out.println(num << 1);
//        //算术右移一位相当于/2
//        System.out.println(num >> 1);
//        //逻辑右移，最右边的位就不要了，在最左边补0
//        System.out.println(num >>> 1);
//          int num = 10;
//          if(num < 0) {
//              System.out.println("hello");
//          }
//          int score = 56;
//          if(score >= 90) {
//              System.out.println("优秀");
//          }else if(score >= 80) {
//              System.out.println("良好");
//          }else if(score >= 70) {
//              System.out.println("中等");
//          }else if(score >= 60) {
//              System.out.println("及格");
//          }else {
//              System.out.println("不及格");
//          }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int num = scanner.nextInt();
//        if(num % 2 == 0) {
//            System.out.println("偶数");
//        }else {
//            System.out.println("奇数");
//        }

        //判断闰年
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int year = scanner.nextInt();
//        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//            System.out.println(year + "是闰年");
//        }else {
//            System.out.println(year + "不是闰年");
//        }


        //根据用户的输入，判断今天是星期几
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入今天是星期几");
//        int day = scanner.nextInt();
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
//                System.out.println("错误");
//                break;
//        }

        ///打印1-10
//        int num = 1;
//        while(num <= 10) {
//            System.out.println(num);
//            num ++;
//        }


        //计算1-100的和
//        int num = 1;
//        int ret = 0;
//        while(num <= 100) {
//            ret += num;
//            num++;
//        }
//        System.out.println(ret);


        //求5的阶乘
//        int num = 1;
//        int ret = 1;
//        while(num <= 5) {
//            ret *= num;
//            num++;
//        }
//        System.out.println(ret);


        //求1！+2！+3！+4！+5！

        // int num = 1;
        //   int result = 0;

        //   while(num <= 5) {
        //     int fac = 1;
        //  int i = 1;
        //   while (i <= num) {
        //       fac *= i;
        //       i++;
        //   }
        //   result += fac;
        //   num++;
        //  }
        //  System.out.println(result);
        //  }

        //for循环
        ///   int result = 0;
        //  for(int num = 1; num <= 5; num++)
        //  {
        //外层循环是用来求和
        //   int fac = 1;
        //  for (int i = 1; i <= num; i++) {
        //里层循环用来求num！
        //       fac *= i;
        //   }
        //  result += fac;

        //  }
        //   System.out.println(result);


        // 猜数字游戏
        ///先中下一个随机数
        //   Random random = new Random();
        //    int toGuess = random.nextInt(101);
        //   Scanner scanner = new Scanner(System.in);
        //  while(true) {
        //      System.out.println("请输入你要猜的数字 [1,100]");
        //     int num = scanner.nextInt();
        //    if (num > toGuess) {
        //        System.out.println("高了");
        //    } else if (num < toGuess) {
        //         System.out.println("低了");
        //    } else {
        //         System.out.println("猜对了");
        //       break;//跳出循环
//        }
        //  }

        //利用方法求1！+2！+3！+4！+5！

//        int sum = 0;
//        for (int i = 1; i <= 5; i++) {
//            sum += fac(i);
//        }
//        System.out.println(sum);
//}
//    public static int fac(int i) {
//        int result = 1;
//        for (int num = 1; num <= i; num++) {
//            result *= num;
//        }
//        return result;



      }
   }




