import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        char[] ch = br.readLine().toCharArray();
        
        StringBuilder sb = new StringBuilder();

        int count = 1;
        sb.append(ch[0]);
        for(int i = 1; i < ch.length; i++) {
            if(ch[i] != ch[i-1]) {
                sb.append(count);
                sb.append(ch[i]);
                count = 0;
            }
            count++;
        }
        sb.append(count);
        System.out.println(sb.length());
        System.out.print(sb.toString());
    }
}