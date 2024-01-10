import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}