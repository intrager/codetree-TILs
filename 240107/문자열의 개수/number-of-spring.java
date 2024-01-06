import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuffer sb = new StringBuffer();
        int orderCount = 0;
        while(!str.equals("0")) {
            orderCount++;
            if(orderCount % 2 == 1) {
                sb.append(str).append('\n');
            }
            str = br.readLine();
        }
        System.out.println(orderCount);
        System.out.print(sb.toString());
    }
}