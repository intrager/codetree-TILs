import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        System.out.print(GCD(n, m));
    }

    private static int GCD(int n, int m) {
        if(m == 0) return n;
        return GCD(m, n % m);
    }
}