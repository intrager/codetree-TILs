import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char one = str.charAt(0);
        char two = str.charAt(1);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == one) {
                sb.append(two);
            } else if(str.charAt(i) == two) {
                sb.append(one);
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.print(sb.toString());
    }
}