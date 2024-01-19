import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
    
        int primeSum = 0;
        for(int i = a; i <= b; i++) {
            if(isPrimeNumber(i)) {
                primeSum += i;
            }
        }
        System.out.print(primeSum);
    }

    private static boolean isPrimeNumber(int j) {
        int divideCount = 0;
        for(int k = 1; k <= j; k++) {
            if(j % k == 0) divideCount++;
        }
        if(divideCount == 2) return true;
        else return false;
    }
}