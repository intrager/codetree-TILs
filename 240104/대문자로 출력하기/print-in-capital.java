import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] chArr = br.readLine().toCharArray();
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < chArr.length; i++) {
            if(chArr[i] > 96 && chArr[i] < 123) {
                char ch = (char)(chArr[i] - 'a' + 'A');
                sb.append(ch);
            } else if(chArr[i] > 64 && chArr[i] < 91) {
                sb.append(chArr[i]);
            }
        }
        System.out.print(sb.toString());
    }
}