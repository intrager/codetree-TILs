import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 100];

        for(int j = 0; j < n; j++) {
            String[] a = br.readLine().split(" ");
            int x1 = Integer.parseInt(a[0]);
            int x2 = Integer.parseInt(a[1]);

            for(int i = x1; i < x2; i++) {
                arr[i]++;
            }
        }

        int cnt = n + 100;
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                cnt = Math.min(cnt, i);
                max = Math.max(max, arr[i]);
            }
        }

        int answer = 0;
        for(int i = cnt; i < arr.length; i++) {
            if(max == arr[i]) {
                answer++;
            }
        }
        System.out.print(answer - 1);
    }
}