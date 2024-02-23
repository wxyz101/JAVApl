import java.util.Scanner;

public class estimate {
    public static void main(String[] args) {
        //初始化
        Scanner in = new Scanner(System.in);
         int balance = 0;
        //读入投币金额

        while (true) {
            System.out.println("请投币:");
            int money = in.nextInt();
            balance = balance + money;
//                System.out.println(money);
//                System.out.println(money >= 5);

            //判断语句如果就
            if (balance >= 5) {
                //打印车票
                System.out.println("**城际快车**");
                System.out.println("*无固定票席*");
                System.out.println("**票价5元**");

                //计算并找零
                System.out.println("找回:" + (balance - 5));
                balance = 0;
            }
        }
        }
}
