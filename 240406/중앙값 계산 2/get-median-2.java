import java.util.StringTokenizer;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                Arrays.sort(arr, 0, i + 1);
                System.out.print(arr[i/2] + " ");
            }
        }
    }
}