import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int oa = a;
        int ob = b;
        //       int gcd = 1;
//        for ( int i = 2; i<=a && i<=b; i++ )
//        {
//            if ( a%i == 0 && b%i == 0 )
//            {
//                gcd = i;
//            }
//        }
        while ( b!= 0 ) //辗转相除法
        {
            int r = a%b;
            a = b;
            b = r;
        }
        System.out.println(oa + "和" + ob + "的最大公约数是" + a);
    }
}
