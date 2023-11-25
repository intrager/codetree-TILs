import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int count = 0;
        for(String str : arr) {
            count += str.length();
        }
        System.out.print(count);
    }
}