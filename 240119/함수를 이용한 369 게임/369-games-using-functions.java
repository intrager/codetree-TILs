import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        int count = 0;
        for(int i = a; i <= b; i++) {
            if(isMagicNumber(i)) {
                count++;
            }
        }
        System.out.print(count);
    }

    private static boolean isMagicNumber(int i) {
        return i % 3 == 0 || isExist369(i);
    }

    private static boolean isExist369(int j) {
        String str = String.valueOf(j);
        boolean is369 = false;
        for(int k = 0; k < str.length(); k++) {
            if(str.charAt(k) == '3' || str.charAt(k) == '6' || str.charAt(k) == '9') {
                is369 = true;
            }
        }
        return is369;
    }
}