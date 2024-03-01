import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        printHelloWorld(n);
    }

    private static void printHelloWorld(int n) {
        if(n == 0) return;
        printHelloWorld(n - 1);
        System.out.println("HelloWorld");
    }
}