package guancha;

import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            String t = scanner.nextLine();
            int len1 = s.length();
            int len2 = t.length();
            if(len1 < len2){
                System.out.println("0");
            }else{
                int count = 0;
                for(int i = 0; i <= len1 - len2;i++){
                    if(s.substring(i,(i + len2)).equals(t)){
                        count++;
                        i += len2;
                    }else{
                        i++;
                    }

                }
                System.out.println(count);
            }

        }


    }
}


//    public static void main(String[] args) {
//        Investor investor1,investor2;
//        investor1 = new ConcreteInvestor("杨过");
//        investor2 = new ConcreteInvestor("小龙女");
//
//        Stock haier = new Stock("青岛海尔",20.00);
//        haier.attach(investor1);
//        haier.attach(investor2);//注册
//        haier.setPrice(25.00);
//
//    }
//}
