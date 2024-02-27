import java.util.*;
import java.io.*;

public class Main {
    public static String text, pattern;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        text = br.readLine();
        pattern = br.readLine();
        System.out.print(findIndex());
    }

    public static int findIndex() {
        int textLength = text.length();
        for(int i = 0; i < textLength; i++) {
            if(isSubString(i))
                return i;
        }
        return -1;
    }

    public static boolean isSubString(int startIndex) {
        int textLength = text.length();
        int patternLength = pattern.length();

        if(startIndex + patternLength - 1 >= textLength)
            return false;

        for(int j = 0; j < patternLength; j++) {
            if(text.charAt(startIndex + j) != pattern.charAt(j))
                return false;
        }
        return true;
    }

    

    public static int getIndex(String base, String object) {
        int index = -1;

        index = base.indexOf(object);
        return index;
    }
}