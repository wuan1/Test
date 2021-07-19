


import java.util.Scanner;
public class java01_27 {

}
//        System.out.println(divide(10,0));
//    }
//    public static int divide(int x,int y){
//        if(y==0){
//            throw new ArithmeticException("抛出除0异常");
//        }
//        return x/y;
//    }
//
//    }






 //  private static String username =  "LNN";
//   private static String password = "123456";

 //  public static void main(String[] args){
//                //实现一个简单的控制台版用户登陆程序, 程序启动提示用户输入用户名密码.
//                // 如果用户名密码出错, 使用自定义异常的方式来处理
//                try {
//
//                    Scanner scanner = new Scanner(System.in);
//                    System.out.println("请输入用户名：");
//                    String username = scanner.next();
//                    System.out.println("请输入用户密码：");
//                    String password = scanner.next();
//                    Login(username, password);
//                } catch (UserError UserError) {
//                    UserError.printStackTrace();
//                } catch (PasswordError PasswordError) {
//                    PasswordError.printStackTrace();
//                }
//            }
//    private static void Login(String username, String password) throws UserError,PasswordError {
//        if (!java01_27.username.equals(username))
//        {
//            throw new UserError("用户名错误");
//        }
//        if (!java01_27.password.equals(password))
//        {
//            throw new PasswordError("用户密码错误");
//        }
//        System.out.println("登陆成功");
//    }
//}
//class UserError extends  Exception{
//    public UserError(String message){
//        super(message);
//    }
//}
//class PasswordError extends  Exception {
//    public PasswordError(String message) {
//        super(message);
//    }
//}






           //递归求 N 的阶乘
//           Scanner scanner = new Scanner(System.in);
//           System.out.println("请输入N的值：");
//           int N = scanner.nextInt();
//           System.out.println(fac(N));
//       }
//
//       private static int fac(int n) {
//           if(n == 0||n == 1){
//       return 1;
//       }else {
//               return n * fac(n - 1);
//           }
//       }
//   }





           // 递归求 1 + 2 + 3 + ... + 10
//           System.out.println(sum(10));
//
//       }
//
//       private static int sum(int n) {
//           if (n == 0) {
//               return 0;
//           } else {
//               return n + sum(n - 1);
//           }
//       }
//   }




//      //递归求斐波那契数列的第 N 项
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个整数：" );
//        int N = scanner.nextInt();
//        System.out.println(fib(N));
//
//    }
//
//    private static int fib(int n) {
//
//        if (n == 1 || n == 2) {
//            return 1;
//        } else {
//            return fib(n - 2) + fib(n - 1);
//
//        }
//    }
//}




//        //写一个递归方法，输入一个非负整数，返回组成它的数字之和
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个非负整数：");
//        int num = scanner.nextInt();
//        System.out.println(sum(num));
//    }
//
//    private static int sum(int i) {
//        if (i == 0) {
//            return 0;
//        } else {
//            int k = i % 10;
//            return (k + sum (i /= 10));
//
//        }
//    }
//}
        //递归求斐波那契数列的第 N 项
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个整数：" );
//        int N = scanner.nextInt();
//        System.out.println(fib(N));
//
//    }
//
//    private static int fib(int n) {
//
//        if (n == 1 || n == 2) {
//            return 1;
//        } else {
//            return fib(n - 2) + fib(n - 1);
//
//        }
//    }
//}


//        char[] arr = str.toCharArray();
//        String result="";
//        for (int i = 0; i < arr.length; i++) {
//            if ((arr[i] >= 'A') && (arr[i] <= 'Z')) {
//                arr[i] = (char) (arr[i] + 32);
//            }
//        }
//        return String.valueOf(arr);
//    }
//}












    //precondition: x >=0
//    public static void mystery(int x) {
//        System.out.print(x % 10);
//        if ((x / 10) != 0){
//            mystery(x / 10);
//        }
//        System.out.print(x % 10);
//    }
//
//    public static void main(String[] args) {
//        mystery(1234);
//    }
//
//}







        //给定两个整型数组, 交换两个数组的内容.
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {6, 7, 8, 9, 10};
//        int i = 0;
//        int tmp = 0;
//        for (i = 0; i < arr1.length; i++) {
//                    tmp = arr1[i];
//                    arr1[i] = arr2[i];
//                    arr2[i] = tmp;
//            }
//        System.out.print("arr1="+Arrays.toString(arr1)+"       "    );
//
//        System.out.print("arr2="+Arrays.toString(arr2));
//        }
//    }






//给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到后面.
//        int []arr={1,2,3,4,5,6,7,8,9,10};
//  int i = 0, j = 0;
//  int tmp = 0;
//  for (i = 0; i < arr.length ; i++) {
//   for (j = i + 1; j < arr.length ; j++) {
//    if (arr[j] % 2 ==0) {
//     tmp = arr[j];
//     arr[j] = arr[i];
//     arr[i] = tmp;
//    }
//  }
//   System.out.print(arr[i]+" ");
//  }
// }
//}
//
