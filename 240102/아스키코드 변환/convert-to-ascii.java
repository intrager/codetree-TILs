import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int val = (int)arr[0].charAt(0);
        char ch = (char)Integer.parseInt(arr[1]);

        System.out.print(val + " " + ch);
    }
}