import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        for(int i = 0; i < arr.length; i++) {
            char ch = (char)Integer.parseInt(arr[i]);
            System.out.print(ch + " ");
        }
    }
}