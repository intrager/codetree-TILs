import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = br.readLine().length();
        int B = br.readLine().length();
        int C = br.readLine().length();

        int min = Math.min(A, Math.min(B, C));
        int max = Math.max(A, Math.max(B, C));
        System.out.print(max-min);
    }
}