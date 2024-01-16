import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        int answer = minimum(a, b, c);
        System.out.print(answer);
    }

    private static int minimum(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}