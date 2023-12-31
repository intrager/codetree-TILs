import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        if(str.length() < n) {
            for(int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
        } else {
            for(int i = 0; i < n; i++) {
                System.out.print(str.charAt(str.length() - 1 - i));
            }
        }
    }
}