import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        int gcd = getGCD(n, m);
        System.out.print((n * m) / gcd);
    }

    private static int getGCD(int n, int m) {
        if(n % m == 0) {
            return m;
        }
        return getGCD(m, n % m);
    }
}