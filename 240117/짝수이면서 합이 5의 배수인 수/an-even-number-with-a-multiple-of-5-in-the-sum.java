import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int sum = 0;

        for(int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }
        if(Integer.parseInt(n) % 2 == 0 && sum % 5 == 0) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}