import java.util.*;
import java.io.*;

public class Main {
    private static int n = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        System.out.print(calculateSequence(1, 2, 4));
    }

    private static int calculateSequence(int count, int a, int b) {
        if(count == n)
            return a;
        
        return calculateSequence(++count, b, a * b % 100);
    }
}