import java.util.*;
import java.io.*;

public class Main {
    private static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        calculate(n);
        System.out.print(count);
    }

    private static int calculate(int n) {
        if(n <= 1)
            return n;
        count++;
        if(n % 2 == 0) {
            return calculate(n / 2);
        } else {
            return calculate(n * 3 + 1);
        }
    }
}