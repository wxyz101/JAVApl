import java.util.Scanner;

public class high {
    public static void main(String[] args) {
        int foot;
        double inch;
        Scanner in = new Scanner(System.in);
        foot = in.nextInt();
        inch = in.nextDouble();
        System.out.println("foot="+foot+","+"inch="+inch);
        System.out.println("foot="+foot);
        System.out.println("inch="+inch);
        System.out.println((int)((foot + inch / 12) * 0.3048*100)+"cm");
        /*当浮点数和整数放到一起运算时，java会将整数转换为浮点数，
        然后进行浮点数运算
        浮点转换int需要强制执行*/
    }
}