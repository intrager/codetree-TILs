import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        while(!str.equals("END")) {
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            System.out.println(sb.toString());

            str = br.readLine();
        }
    }
}