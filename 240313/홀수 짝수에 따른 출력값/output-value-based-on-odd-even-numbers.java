import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.print(calculateBasedEvenOrOdd(n));
    }

    private static int calculateBasedEvenOrOdd(int n) {
        if(n <= 2)
            return n;
        if(n % 2 == 0) {
            return calculateBasedEvenOrOdd(n - 2) + n;
        } else {
            return calculateBasedEvenOrOdd(n - 2) + n;
        }
    }
}