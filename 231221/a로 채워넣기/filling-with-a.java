import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] arr = str.toCharArray();
        
        arr[1] = 'a';
        arr[arr.length-2] = 'a';
        str = String.valueOf(arr);
        System.out.print(str);
    }
}