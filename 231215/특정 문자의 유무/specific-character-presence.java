import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String ee = "No", ab = "No";
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.substring(i, i + 2).equals("ee")) {
                ee = "Yes";
            }
            if(str.substring(i, i + 2).equals("ab")) {
                ab = "Yes";
            }
        }

        System.out.print(ee + " " + ab);
    }
}