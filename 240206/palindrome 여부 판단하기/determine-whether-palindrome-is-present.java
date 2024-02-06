import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        if(isPalindrome(A)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    private static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(sb.toString().equals(s)) {
            return true;
        } else {
            return false;
        }
    }
}