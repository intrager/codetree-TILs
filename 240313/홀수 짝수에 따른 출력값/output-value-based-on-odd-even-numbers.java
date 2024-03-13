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
        return calculateBasedEvenOrOdd(n - 2) + n;
    }
}