import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        printOneToEnd(n);
        System.out.println();
        printEndToOne(n);
    }

    private static void printOneToEnd(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    private static void printEndToOne(int n) {
        while(n > 0) {
            System.out.print(n-- + " ");
        }
    }
}