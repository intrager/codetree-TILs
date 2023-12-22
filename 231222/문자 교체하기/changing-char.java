import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        String str1 = arr[0];
        String str2 = arr[1];

        System.out.print(str1.substring(0, 2) + str2.substring(2));
    }
}