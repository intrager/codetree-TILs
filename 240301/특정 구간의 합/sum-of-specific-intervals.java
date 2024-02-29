import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX_N = 100;

    private static int[] A = new int[MAX_N + 1];
    private static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 1; i <= n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            System.out.println(sumInRange(a1, a2));
        }
    }

    private static int sumInRange(int a1, int a2) {
        int sum = 0;
        for(int i = a1; i <= a2; i++) {
            sum += A[i];
        }
        return sum;
    }
}