import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ch = (int)br.readLine().charAt(0) + 1;
        if(ch > 126) {
            ch = 97;
        }
        System.out.print((char)ch);
    }
}