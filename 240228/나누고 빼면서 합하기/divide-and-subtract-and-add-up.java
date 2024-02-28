import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
    
        int[] A = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < n; i++) { 
            A[i] = Integer.parseInt(st.nextToken());
        }

        int answer = plusElement(A, m);
        System.out.print(answer);
    }

    private static int plusElement(int[] A, int m) {
        int elementSum = 0;
        while(m >= 1) {
            elementSum += A[m-1];

            if(m % 2 == 1) {
                m -= 1;
            } else {
                m /= 2;
            }
        }

        return elementSum;
    }
}