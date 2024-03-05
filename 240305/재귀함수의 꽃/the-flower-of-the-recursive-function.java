import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        calculate(n);
    }

    private static void calculate(int n) {
        if(n == 0)
            return;
        System.out.print(n + " ");
        calculate(n - 1);
        System.out.print(n + " ");
    }
}