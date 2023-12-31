import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int len = str.length();

        String order = br.readLine();
        for(int i = 0; i < order.length(); i++) {
            if(order.charAt(i) == 'L') {
                str = str.substring(1, len) + str.substring(0, 1);
            } else {
                str = str.substring(len-1, len) + str.substring(0, len-1);
            }
        }
        System.out.print(str);
    }
}