import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        for(int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                System.out.print(Character.toLowerCase(str.charAt(i)));
            } else {
                System.out.print(Character.toUpperCase(str.charAt(i)));
            }
        }
    }
}