import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
    
        int[] A = new int[n1];
        int[] B = new int[n2];

        st = new StringTokenizer(br.readLine(), " ");
        int arrayIndex = 0;
        while(st.hasMoreTokens()) {
            A[arrayIndex++] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        arrayIndex = 0;
        while(st.hasMoreTokens()) {
            B[arrayIndex++] = Integer.parseInt(st.nextToken());
        }
        
        if(isConsecutiveNumberSubSequence(A, B, n1, n2)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    private static boolean isConsecutiveNumberSubSequence(int[] A, int[] B, int n1, int n2) {
        for(int i = 0; i <= n1 - n2; i++) {
            for(int j = 0; j < n2 - 1; j++) {
                if(B[j] == A[j + i] && B[j + 1] == A[j + 1 + i]) {
                    return true;
                }
            }
        }
        return false;
    }
}