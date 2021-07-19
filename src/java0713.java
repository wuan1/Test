import java.util.Random;
import java.util.Scanner;

public class java0713 {
    //猜数字游戏
//    public static void main(String[] args) {
//        GuessNumGame();
//    }
//
//
//    public static void GuessNumGame() {
//        while (true) {
//            // menu 用于和玩家进行交互
//            // 返回值表示玩家输入的选项.
//            // 玩家输入 1 表示开始一局猜数字游戏
//            // 玩家输入 0 表示结束整个程序
//            int choice = menu();
//            if (choice == 1) {
//                game();
//            } else if (choice == 0) {
//                System.out.println("goodbye");
//                break;
//            } else {
//                System.out.println("您的输入有误, 请重新输入");
//            }
//        }
//    }
//
//    private static void game() {
//        // 1. 先生成一个 1-100 之间的随机整数
//        Random random = new Random();
//        int toGuess = random.nextInt(100);
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            // 2. 提示玩家来输入一个整数
//            System.out.println("请输入要猜的整数: ");
//            int num = scanner.nextInt();
//            // 3. 进行判断
//            if (num < toGuess) {
//                System.out.println("低了");
//            } else if (num > toGuess) {
//                System.out.println("高了");
//            } else {
//                System.out.println("猜对了");
//                break;
//            }
//        }
//    }
//
//    private static int menu() {
//        System.out.println("====================");
//        System.out.println(" 1. 开始游戏");
//        System.out.println(" 0. 退出游戏");
//        System.out.println("====================");
//        System.out.println(" 请输入您的选择: ");
//        Scanner scanner = new Scanner(System.in);
//        int choice = scanner.nextInt();
//        return choice;
//    }
//}

    //登录  输错密码3次，程序强制退出
//    public static void main(String[] args) {
//        login();
//    }
//
//    public static void login() {
//        String password = "123456";
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入您的密码：");
//        int i = 0;
//        for (; i < 3; i++) {
//            String input = scanner.next();
//            if(input.equals(password)){
//                System.out.println("登陆成功");
//                break;
//            }else{
//                System.out.println("密码错误");
//            }
//        }
//        if(i == 3){
//            System.out.println("密码三次输入错误，系统强制退出");
//        }
//    }


    public static void main(String[] args) {

    }
}


