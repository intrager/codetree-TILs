import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();

        int count = 0;
        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) == B.charAt(0) && A.charAt(i+1) == B.charAt(1)) {
                count++;
            }
        }
        System.out.print(count);
    }
}