import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(i % 2 == 1) {
                sb.append(str.charAt(i));
            }
        }
        sb.reverse();
        System.out.print(sb.toString());
    }
}