import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < arr.length; i++) {
            if(isAplhabet(arr[i])) {
                sb.append(Character.toLowerCase(arr[i]));
            } else if(isNumber(arr[i])) {
                sb.append(arr[i]);
            }
        }
        System.out.print(sb.toString());
    }

    private static boolean isAplhabet(char ch) {
        if((ch > 64 && ch < 91) || (ch > 96 && ch < 123)) {
            return true;
        } else {
            return false;
        }
    }
    
    private static boolean isNumber(char ch) {
        if(ch > 47 && ch < 58) {
            return true;
        } else {
            return false;
        }
    }
}