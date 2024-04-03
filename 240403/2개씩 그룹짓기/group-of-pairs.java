import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
    
        String[] str = br.readLine().split(" ");
        Arrays.sort(str);

        for(int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(str[i]);
        }
        for(int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(str[i + n]);
        }
        int answer = 0;

        for(int i = 0; i < n; i++) {
            answer = Math.max(answer, arr1[i] + arr2[n - 1 - i]);
        }
        System.out.print(answer);
    }
}