import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int answer = 0;
        for(int i = a; i <= b; i++) {
            if(isPrime(i) && isSumEven(i)) {
                answer++;
            }
        }
        System.out.print(answer);
    }

    private static boolean isPrime(int num) {
        int primeCount = 0;
        for(int j = 1; j <= num; j++) {
            if(num % j == 0) primeCount++;
        }
        if(primeCount > 2) return false;
        else return true;
    }

    private static boolean isSumEven(int num) {
        String[] str = String.valueOf(num).split("");
        int sum = 0;
        for(int k = 0; k < str.length; k++) {
            sum += Integer.parseInt(str[k]);
        }
        if(sum % 2 == 0) return true;
        else return false;
    }
}