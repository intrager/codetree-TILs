import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_N = 100;

    public static int[] A = new int[MAX_N + 1];
    public static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
    
        st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 1; i <= n; i++) { 
            A[i] = Integer.parseInt(st.nextToken());
        }

        cnt = m;
        System.out.print(plusElement());
    }

    private static int plusElement() {
        int elementSum = 0;
        while(cnt >= 1) {
            elementSum += A[cnt];

            if(cnt % 2 == 1) {
                cnt -= 1;
            } else {
                cnt /= 2;
            }
        }

        return elementSum;
    }
}