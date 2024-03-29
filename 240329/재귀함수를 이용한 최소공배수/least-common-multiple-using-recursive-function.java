import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Main {    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int answer = arr[0];
        for(int i = 1; i < n; i++) {
            answer = getLCM(answer, arr[i]);
        }
        System.out.print(answer);
    }

    private static int getLCM(int a, int b) {
        return (a * b) / getGCD(a, b);
    }

    private static int getGCD(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}