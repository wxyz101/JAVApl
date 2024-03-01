import java.util.Scanner;

public class prime_nm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int number = 1;
        int sum = 0;
        for ( int a=2; number<=m; a++) {
            int prime = 1;
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    prime = 0;
                    break;
                }
            }
                if ( prime == 1)
                {
                    if ( number == n)
                    {
                        sum = sum+a;
                        n++;
                    }
                    number++;
                }
                if ( n >m)
                {
                    break;
                }
            }
            System.out.println(sum);
        }
    }

