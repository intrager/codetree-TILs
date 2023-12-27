import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int len = str.length();
        
        str = str.substring(1, len) + str.substring(0, 1);
        System.out.print(str);
    }
}