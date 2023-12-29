import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println(str);
        int len = str.length();
        for(int i = 0; i < len; i++) {
            str = str.substring(len-1, len) + str.substring(0, len-1);
            System.out.println(str);
        }
    }
}