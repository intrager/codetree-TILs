import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.print(calculate(n));
    }

    private static int calculate(int n) {
        if(n == 1)
            return 0;
        if(n % 2 == 0) {
            return calculate(n / 2) + 1;
        } else {
            return calculate(n / 3) + 1;
        }
    }
}