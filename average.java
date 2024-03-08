import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      // int x;
        double sum = 0;
          //x = in.nextInt();
        // int cnt = 0;
        int cnt = in.nextInt();
        if (cnt > 0) {
            int[] numbers = new int[cnt];//int类型的数组 创建一个新的有100个int的数组
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = in.nextInt();
                sum += numbers[i];
            }
//            while (x != -1) {
//                numbers[cnt] = x; // numbers[1] = x 以此类推 对数组赋值
//                sum += x;
//                cnt++;
//                x = in.nextInt();
//            }
//            if (cnt > 0) {
                double average = sum / cnt;
                //遍历数组的循环
                for (int i = 0; i < cnt; i++) {
                    if (numbers[i] > average) {
                        System.out.println(numbers[i]);
                    }
                }
                System.out.println(sum / cnt);
            }
        }
    }

