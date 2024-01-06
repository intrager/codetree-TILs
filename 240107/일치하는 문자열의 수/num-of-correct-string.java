import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        
        int n = Integer.parseInt(arr[0]);
        String A = arr[1];

        int count = 0;
        while(n-- > 0) {
            String str = br.readLine();
            if(A.equals(str)) count++;
        }
        System.out.print(count);
    }
}