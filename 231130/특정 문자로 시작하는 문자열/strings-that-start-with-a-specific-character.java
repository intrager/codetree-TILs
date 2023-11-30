import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }
        String ch = br.readLine();

        int sum = 0, count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].startsWith(ch)) {
                sum += arr[i].length();
                count++;
            }
        }

        System.out.printf("%d %.2f", count, (double)sum/count);
    }
}