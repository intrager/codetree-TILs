import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split(" ");
        String[] arr1 = br.readLine().split(" ");
        
        int len = arr.length;
        int len1 = arr1.length;
        
        for(int i = 0; i < len; i++) {
            sb.append(arr[i]);
        }

        for(int i = 0; i < len1; i++) {
            sb.append(arr1[i]);
        }
        System.out.print(sb.toString());
    }
}