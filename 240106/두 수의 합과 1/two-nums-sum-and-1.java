import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        String str = (Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])).toString();

        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 48) count++;
        }
        System.out.print(count);
    }
}