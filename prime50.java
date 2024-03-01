import java.util.Scanner;

public class prime50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 1;//为什么这个number要定义在外面？
        for (int n = 2; n < 1000; n++) {
            //int number = 1;
                int prime = 1;
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        prime = 0;
                        break;
                    }
                }
                if (prime == 1) {
                    System.out.print("第"+ number + "个素数" + "是" + n + "   ");
                    number = number + 1;
                }
            if ( number > 50)
                {
                    break;
                }

            }
        }
}



