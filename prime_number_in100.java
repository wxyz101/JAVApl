import java.util.Scanner;

public class prime_number_in100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int i;
       // int prime = 1;
        for (n = 2; n < 100; n++) {
           int prime = 1;//? 这个prime为什么要定义在for循环里面？
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                   prime = 0;
                    break;
                }
            }
            if (prime == 1)
           // if( n==i)
                {
                System.out.print(n + "  "); //print输出不换行
            }
        }
    }
}
