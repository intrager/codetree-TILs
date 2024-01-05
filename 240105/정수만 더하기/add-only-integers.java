import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
        int value = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 47 && arr[i] < 58) {
                value += (int)arr[i] - 48;
            }
        }
        System.out.print(value);
    }
}