import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char ch = br.readLine().charAt(0);

        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};
        
        int count = 0;
        for(String str : arr) {
            for(int i = 0; i < str.length(); i++) {
                if(i == 2 || i == 3) {
                    if(str.charAt(i) == ch) {
                        count++;
                        System.out.println(str);
                        break;
                    }
                }
            }
        }
        System.out.print(count);
    }
}