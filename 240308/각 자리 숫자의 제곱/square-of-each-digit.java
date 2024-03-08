import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.print(addEachSquare(n));
    }

    private static int addEachSquare(int n) {
        if(n < 10)
            return n * n;
        return addEachSquare(n / 10) + (n % 10) * (n % 10);
    }
}