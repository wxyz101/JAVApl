import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;

public class ergodic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] data = {3, 2, 5, 7, 4, 9, 11, 34, 12, 28};
        int x = in.nextInt();
        int loc = -1;
        boolean found = false;
        for ( int i=0; i< data.length; i++)
        {
            if ( x == data[i])
            {
                loc = i;
                break;
            }
        }
//        for each循环：对于data数组的每一个元素循环每一轮把他取出作为一个k
        for ( int k : data)//k在第一轮等于data【0】以此类推
        {
            if ( k == x)
            {
                found = true;
                break;
            }
        }
        if ( loc >= -1) //?
        {
            System.out.println(x+"是第"+(loc+1)+"位");
        }
        else
        {
            System.out.println(x+"不在其中");
        }
    }
}
