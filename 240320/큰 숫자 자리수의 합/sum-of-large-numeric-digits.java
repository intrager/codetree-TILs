import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        System.out.print(sumDigit(a * b * c));
    }

    private static int sumDigit(int n) {
        if(n < 10)
            return n;
        
        return sumDigit(n / 10) + n % 10;
    }
}