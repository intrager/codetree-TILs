import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int m1 = Integer.parseInt(arr[0]);
        int d1 = Integer.parseInt(arr[1]);
        int m2 = Integer.parseInt(arr[2]);
        int d2 = Integer.parseInt(arr[3]);

        //                                1.  2.  3.  4.  5.  6.  7.  8.  9. 10. 11. 12.
        int[] daysOfMonth = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < m1; i++) {
            sum1 += daysOfMonth[i];
        }
        sum1 += d1;

        for(int i = 0; i < m2; i++) {
            sum2 += daysOfMonth[i];
        }
        sum2 += d2;

        System.out.print(sum2 - sum1 + 1);
    }
}