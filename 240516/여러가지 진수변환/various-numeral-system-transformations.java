import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        int[] digits = new int[20];
        int cnt = 0;

        while(true) {
            if(n < b) {
                digits[cnt] = n;
                break;
            }

            digits[cnt++] = n % b;
            n /= b;
        }
        for(int i = cnt; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}