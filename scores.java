import java.util.Scanner;

public class scores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] scores = {87,98,69,54,65,76,87,99};
        System.out.println(scores.length);
        for ( int i=0; i< scores.length; i++)
        {
            System.out.print(scores[i] + " ");
        }
    }
}
