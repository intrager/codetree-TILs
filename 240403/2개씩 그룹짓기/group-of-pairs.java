import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n*2];
    
        String[] str = br.readLine().split(" ");

        for(int i = 0; i < n * 2; i++) {
            arr[i] = Integer.parseInt(str[i]);   
        }
        Arrays.sort(arr, 0, 2 * n);

        int answer = 0;
        for(int i = 0; i < n; i++) {
            answer = Math.max(answer, arr[i] + arr[n*2 - i - 1]);
        }
        System.out.print(answer);
    }
}