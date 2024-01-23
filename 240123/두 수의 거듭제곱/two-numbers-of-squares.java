import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        double a = Double.parseDouble(arr[0]);
        double b = Double.parseDouble(arr[1]);
    
        int answer = square(a, b);
        System.out.print(answer);
    }

    private static int square(double a, double b) {
        return (int) Math.pow(a, b);
    }
}