import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] n = br.readLine().split("");
        int sum = 0;

        for(int i = 0; i < n.length; i++) {
            sum += Integer.parseInt(n[i]);
        }
        if(sum % 5 == 0) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}