import java.sql.SQLOutput;
import java.util.Scanner;

public class guess_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //给定一个随机数 [0,1)-->[0,100)-->[1,100]
        int number = (int) (Math.random() * 100 + 1);
        int a;
        int count = 0;

        do {
            a = in.nextInt();
            count = count + 1;
            if (a > number) {
                System.out.println("偏大");
            } else if (a < number) {
                System.out.println("偏小");
            }
        } while (a != number);

        System.out.println("boom!" + count + "次");
    }
}

