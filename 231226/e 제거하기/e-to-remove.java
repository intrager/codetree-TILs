import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int a = str.indexOf("e");

        if(a == 0) {
            str = str.substring(1);
        } else {
            str = str.substring(0, a) + str.substring(a + 1, str.length());
        }
        System.out.print(str);
    }
}