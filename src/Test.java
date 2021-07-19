import java.util.Random;








//  class X{
//   Y y=new Y();
//   public X(){
//    System.out.print("X");
//   }
//  }
//  class Y{
//   public Y(){
//    System.out.print("Y");
//   }
//  }
// public class Test extends X {
//  Y y=new Y();
//  public Test() {
//   System.out.print("Test");
//  }
//
//
//   public static void main(String[] args) {
//    new Test();
//   }
//  }





 //实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} ,
  // 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
//  int []arr={1,2,3};
//  String a=toString(arr);
//  System.out.println(a);
//   }
//
// private static String toString(int[] arr) {
//  String ret = "\"";
//  ret += "[";
//  for (int i = 0; i < arr.length; i++) {
//   if (i < arr.length - 1) {
//    ret += arr[i] + ",";
//   } else if (i == arr.length - 1) {
//    ret += arr[i] + "]";
//   }
//  }
//  ret += "\"";
//  return ret;
// }
// }



  //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
//  int []arr={1,2,3,4,5,6,7,8,9};
//  System.out.println(Arrays.toString(copyOf(arr)));
//
//     }
//
// private static int[] copyOf(int[] arr) {
//  int i=0;
//  int []arr2=new int[arr.length];
//  for(i=0;i<arr.length;i++){
//   arr2[i]=arr[i];
//  }
//  return arr2;
// }
//
//}




//给定一个有序整型数组, 实现二分查找
//  int[] arr = { 2,4,6,3,1,9,7 };
//  int index = getIndex(arr,6);
//  System.out.println("index:"+index);
// }
//
// public static int getIndex(int[] arr, int num) {
//  for (int i = 0; i < arr.length; i++) {
//   if (num == arr[i]) {
//    return i;
//   }
//  }
//  return -1;
// }
//}

//给定一个整型数组, 判定数组是否有序（递增）
//  int[] arr = {1, 3, 5, 7, 9, 2 , 4 , 6 , 8};
//  isOrder(arr);
//  System.out.println(isOrder(arr));
// }
//
// private static boolean isOrder(int[] arr) {
//  int i = 0, j = 0;
//  for (i = 0; i < arr.length; i++) {
//   if (arr[i] > arr[i + 1]) {
//    return false;
//   }
//  }
//  return true;
// }
//}




 //给定一个整型数组, 实现冒泡排序(升序排序)
// int[] arr = {3, 5, 1, 4, 7, 2, 9, 8, 6};
// buffer_sort(arr);
// System.out.println(Arrays.toString(arr));
//}
//
//
// private static void buffer_sort(int[] arr) {
//  int i=0,j=0;
//  for(i=0;i<arr.length;i++){
//   for(j=arr.length-1;j>i;j--){
//    if(arr[j-1]>arr[j]){
//     int temp=arr[j-1];
//     arr[j-1]=arr[j];
//     arr[j]=temp;
//    }
//   }
//  }
// }
// }


 //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
// int []arr=new int[100];
// Setnumber(arr);
// System.out.println(Arrays.toString(arr));
//   }
//
// private static int[] Setnumber(int[] arr) {
// for(int i=0;i<100;i++){
//  arr[i]=i+1;
// }
// return arr;
//
// }
//}



 //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
// int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
// printArray(arr);
//}
//
// private static void printArray(int[] arr) {
// for(int i=0;i<arr.length;i++){
//  System.out.println(arr[i]);
//
// }
// }
//}
//实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
// 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}

// int[] arr={1,2,3};
// transform(arr);
// System.out.println(Arrays.toString(arr));
//}
// public static void transform(int[] arr){
//  for(int i=0;i< arr.length;i++){
//   arr[i]*=2;
//  }
// }
//}

 //实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
// int []arr={1,2,3,4,5,6,7,8,9,10};
// System.out.println(sum(arr));
//  }
//
// private static double sum(int[] arr) {
// int result=0;
// for(int i:arr)
//  result+=i;
// return result;
//
//    }
//}




 //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
// int []arr={1,2,3,4,5,6,7,8,9,10};
// System.out.println(avg(arr));
//    }
// private static double avg(int[] arr) {
// double ret=0;
//  double avg;
//  for(int x:arr){
//   ret+=x;
//  }
//  avg=ret/arr.length;
//  return avg;
// }
//}






 //实现方法 compareTo, 能够实现按照字典序比较字符串大小
// String a="Hello";
// String b="hello";
// System.out.println(a.compareTo (b));
//    }
//}



 //实现方法 contains, 能够判定字符串中是否包含子串
// String a="helloworld";
 ///System.out.println(a.contains("world"));
   // }
//}




//实现方法 indexOf, 能够找出字符串子串存在的位置
 //String a="helloworld";
// int i=a.indexOf('w');
 ///System.out.println(i);
//}
//}





 //实现方法 replace, 能够替换字符串中的某个部分
// String a="HelloWorld";
// System.out.println(a.replace('o','a'));
//}
//
//}




//  //实现方法 split, 能够指定分割符将字符串拆分成字符串数组(不必支持正则表达式)
//  String a="192.168.0.1";
//  String []result=a.split ("\\.");
//  System.out.println(Arrays.toString(result));
//   }
//}





// String str = new String("good");
// char[ ] ch = { 'a' , 'b' , 'c' };
//
//
//    Test ex = new Test();
//    ex.change(ex.str,ex.ch);
//    System.out.print(ex.str + " and ");
//    System.out.print(ex.ch);
//   }
//   public void change(String str,char ch[ ]){
//    str = "test ok";
//    ch[0] = 'g';
//   }
//  }
//







// 有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
//int []arr={1,1,2,2,3,3,4,4,5,6,6,7,7};
//int i=0;
//int j=0;
//for(i=0;i<=arr.length-1;i++){
// int count=0;
// for(j=0;j<=arr.length-1;j++){
//  if(arr[i]==arr[j]){
//   count++;
//  }
//  if(count==2){
//   break;
//  }
// }
// if(j==arr.length){
//  System.out.println(arr[i]);
//        }
//      }
//    }
//  }





//  //求1！+2！+3！+4！+........+n!的和
//  Scanner scanner = new Scanner(System.in);
//  System.out.println("请输入n的值：");
//  int n = scanner.nextInt();
//  int i=0,j=0;
//  int sum=0;
//  int temp=1;
//  for(i=1;i<=n;i++){
//   for(j=1;j<=i;j++){
//    temp=temp*j;
//   }
//   sum+=temp;
//   temp=1;
//  }
//  System.out.println("sum="+sum);
// }
//}






//  //求 N 的阶乘 。
//  Scanner scanner=new Scanner(System.in);
//  System.out.println("请输入N的值： ");
//  int N=scanner.nextInt();
//  fac(N);
//
// }
//
// private static void fac(int n) {
//  int i=0;
//  int fac=1;
//  for(i=1;i<=n;i++) {
//   fac = fac * i;
//  }
//   System.out.println(n+"!="+fac);
// }
//}




//  //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
//  int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//  int i = 0, j = 0;
//  int tmp = 0;
//  for (i = 0; i < arr.length ; i++) {
//   for (j = i + 1; j < arr.length ; j++) {
//    if (arr[j] % 2 != 0) {
//     tmp = arr[j];
//     arr[j] = arr[i];
//     arr[i] = tmp;
//    }
//  }
//   System.out.print(arr[i] + "  ");
//  }
// }
//}


//  //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
//  //​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
//  Scanner scanner = new Scanner(System.in);
//  System.out.println("请输入a,b的值 ");
//  int a = scanner.nextInt();
// int b = scanner.nextInt();
//  int Maxnum = Max2(a, b);
//  System.out.println("Maxnum=" + Maxnum);
//  System.out.println("请输入c,d,e的值");
//  int c = scanner.nextInt();
//  int d = scanner.nextInt();
//  int e=scanner.nextInt();
//  int Maxnum1 = Max3(c, d, e);
//  System.out.println("Maxnum1=" + Maxnum1);
//    }
// public static int Max2(int a, int b) {
//  return a > b ? a : b;
// }
// public static int Max3(int a, int b, int c) {
//  int  Max3;
//  int Max2=Max2(a,b);
//  if(Max2>c) {
//   Max3 = Max2;
//  }else
//   Max3=c;
//  return Max3;
//     }
//}



//  // 在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，
//  // 以及两个小数和一个整数的大小关系
//  Scanner scanner = new Scanner(System.in);
//  System.out.println("请输入a,b的值 ");
//  int a = scanner.nextInt();
//  int b = scanner.nextInt();
//  int result = Max(a, b);
//  System.out.println("result=" + result);
//  System.out.println("请输入c,d的值");
//  double c = scanner.nextDouble();
//  double d = scanner.nextDouble();
//  double result1 = Max(c, d);
//  System.out.println("result1=" + result1);
//  System.out.println("请输入e,f,g的值");
//  double e = scanner.nextDouble();
//  double f = scanner.nextDouble();
//  int g = scanner.nextInt();
//  com(e, f, g);
//
// }





//
// public static int Max(int a, int b) {
//  return a > b ? a : b;
// }
//
// public static double Max(double a, double b) {
//  return a > b ? a : b;
// }
//
// public static double com(double a, double b, int c) {
//  double size = a > b ? a : b;
//  double max = size > c ? size : c;
//  double size1 = a < b ? a : b;
//  double min = size1 < c ? size1 : c;
//  double mid = (a + b + c*1.0) - max - min;
//  System.out.println(max + ">" + mid + ">" + min);
//  return 0;
// }
//}



  //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
//  Scanner scanner=new Scanner(System.in);
//  System.out.println("请输入a,b的值 ");
//  int a=scanner.nextInt();
//  int b=scanner.nextInt();
//  int result=sum(a,b);
//  System.out.println("result="+result);
//  System.out.println("请输入c,d,e的值 ");
//  double c=scanner.nextDouble();
//  double d=scanner.nextDouble();
//  double e=scanner.nextDouble();
//  double result1=sum(c,d,e);
//  System.out.println("result1="+result1);
//     }
// public static int sum(int a, int b) {
//  return a+b;
// }
// public static double sum(double a, double b, double c) {
//  return a+b+c;
//   }
//}




//  //输出n*n的乘法口诀表，n由用户输入。
//  int i=1;
//  int j=1;
//  for(i=1;i<=n;i++) {
//   for(j=1;j<=i;j++) {
//    System.out.print(j+"*"+i+"="+j*i+" " );
//   }
//   System.out.println();
//  }
// }
// public static void main(String[] args) {
//  System.out.println("请输入一个整数：");
//  Scanner scanner = new Scanner(System.in);
//  int n = scanner.nextInt();
//  multi(n);
// }
//}






 //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3

//  if (num > 9)
//   print(num / 10);
//  System.out.println(num % 10);
// }
//
// public static void main(String[] args) {
//
//  System.out.println("请输入一个整数");
//  Scanner scanner = new Scanner(System.in);
//  int num = scanner.nextInt();
//  print(num);
// }
//}




//  //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误，
//  // 可以重新输 入，最多输入三次。三次均错，则提示退出程序
//
//  String password = "123456";
//  int i;
//  for (i = 0; i <= 2; i++) {
//   System.out.println("请输入密码：");
//   Scanner scanner = new Scanner(System.in);
//   String input = scanner.next();
//   if (input.equals(password)) {
//    System.out.println("登陆成功");
//    break;
//   } else {
//    System.out.println("密码错误，请重新输入");
//   }
//  }
//  if(i ==3){
//  System.out.println("您已经连续输入三次，将退出程序");
//   }
// }
//}





  //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
//  System.out.println("请输入一个整数");
//     Scanner scanner= new Scanner(System.in);
//     int num=scanner.nextInt();
//  System.out.println("偶数序列：");
//    for(int i=31;i>0;i-=2)
//     System.out.print((num>>i)&1);
//  System.out.println( );
//  System.out.println("奇数序列：");
//    for(int i=30;i>=0;i-=2)
//     System.out.print((num>>i)&1);
//       }
// }




//  //求一个整数，在内存当中存储时，二进制1的个数。
//  int count=0;
//  int i;
//  Scanner scanner=new Scanner(System.in);
//  System.out.println("请输入一个整数");
//  int n=scanner.nextInt();
//  for(i=0;i<32;i++) {
//   if (((n >> i) & 1) == 1) {
//    count++;
//   }
//  }
//   System.out.println("count="+count);
//  }
// }

//     //求两个正整数的最大公约数
//     int m,n,temp;
//     Scanner scanner=new Scanner(System.in);
//     System.out.println("请输入两个整数：");
//     int a=scanner.nextInt();
//     int b=scanner.nextInt();
//     m=a;
//     n=b;
//     if(a<b) {
//        m = b;
//        n = a;
//     }
//     while(n>0){
//        temp=m%n;
//        m=n;
//        n=temp;
//     }
//     System.out.println("最大公约数是:"+m);
//  }
//}





//       //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
//      int n;
//      float i= 1;
//      float sum=0;
//      int j=1;
//      for(n=1;n<=100;n++)
//      {
//         sum=sum+(i/n)*j;
//         j=-j;
//      }
//      System.out.println("sum="+sum);
//   }
//}

//       Scanner sc = new Scanner(System.in);
//       while (sc.hasNext()){
//           int n = sc.nextInt();
//           boolean flag = true;
//           for (int i=1; i<=n; i++){
//               for (int j=1; j<=n; j++){
//                   if (j == i || j == n-i+1)
//                       System.out.print("*");
//                   else
//                       System.out.print(" ");
//               }
//               System.out.println();
//           }
//       }
//   }
//}




//水仙花数

//       for (int i = 100; i <=999 ; i++) {
//           int count=0;
//           int sum=0;
//           int tmp=i;
//           while(tmp!=0){    //这个循环是为了计算出i的位数，也就是我们需要的次方
//               count++;       //次方数保存在count
//               tmp/=10;
//           }
//           tmp=i;    //重置使tmp=i,进入下一个计算sum的循环
//           while(tmp!=0){
//               sum+=(int)Math.pow(tmp%10,count);   //计算次方和
//               tmp/=10;
//           }
//           if(i==sum){    //如果i和次方和sum相等，则是水仙花数
//               System.out.println(i);
//           }
//       }
//   }
//}

//        //猜数字游戏
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int rand = random.nextInt(100);
//        while(true) {
//            System.out.println("请输入一个数字：");
//            int num = scanner.nextInt();
//            if(num>rand) {
//                System.out.println("猜大了");
//            }
//            else if(num==rand) {
//                System.out.println("猜对了");
//                break;//猜对后跳出循环
//            }
//            else{
//                System.out.println("猜小了");
//            }
//        }
//        System.out.println("游戏结束！");
//    }
//}



        //打印 X 图形
/*
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            for(int i=1;i<=num;i++){
                for(int j=1;j<=num;j++){
                    if(j==i||j==num-i+1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }

                }
                System.out.print("\n");
            }
        }
    }
}*/


        // 根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个正整数：");
//        int age = scanner.nextInt();
//        if (age>0&&age <= 18) {
//            System.out.println("少年");
//        }
//            if (age >= 19 && age <= 28) {
//                System.out.println("青年");
//            }
//           if (age >= 29 && age <= 55) {
//               System.out.println("中年");
//           }
//           if(age>=56) {
//               System.out.println("老年");
//           }
//    }
//}





        //给定一个数字，判定一个数字是否是素数
//        int i;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个正整数: ");
//        int  n = scanner.nextInt();
//        for( i = 2;i < n;i++){
//            if(n % i == 0){
//                System.out.println("不是素数");}
//            else{
//                System.out.println("是素数");
//            }
//           break;
 //       }
//    }
//}

//        int i = 1,j = 2;
//        for(i=2;i<=100;i++) {
//            j = 2;
//            while (i % j != 0) {
//                j++;
//            }
//            if (j == i)
//            {
//                System.out.println(i);
//            }
//        }




//输出1000-2000之间的闰年

//            int year=1000;
//            for(year=1000;year<=2000;year++){
//                if((year%4==0&&year%100!=0)||(year%400==0))
//                    System.out.println(  "year="+year);
//
//              }
//
//        }
//     }
//
//}



//        System.out.println("hello");
//        System.out.println("\\\"hello\\\"");
        //System.out.println("\\"hello\\"");
//        System.out.println("/\"hello/\"");
//        short a =128;
//
//        byte b =(byte) a;
//        System.out.println(a);
//        System.out.println(b);



        //输出1-100之间9的个数
       // int num=0,count=0;
        //for(num=1;num<=100;num++)
       // {
        //   if(num/10==9)
        //      count++;
        //   if(num%10==9)
        //      count++;
        // }
        // System.out.println(count);

