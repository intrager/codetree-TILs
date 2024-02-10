import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();

        if(hasAnotherAlphabet(A)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    private static boolean hasAnotherAlphabet(String str) {
        int[] arr = new int[26];
        alphabetCounting(str, arr);

        int anotherAlphabetCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) anotherAlphabetCount++;
        }

        if(anotherAlphabetCount > 1) return true;
        else return false;
    }

    private static void alphabetCounting(String str, int[] arr) {
        for(int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 97]++;
        }
    }
}