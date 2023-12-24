import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        while(str.length() > 1) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) str = str.substring(1);
            else if (n >= str.length()) str = str.substring(0, str.length() - 1);
            else str = str.substring(0, n) + str.substring(n + 1, str.length());
            System.out.println(str);
        }
    }
}