import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int answer = 0;
        for(int i = 0; i < arr.length; i++) {
            StringBuffer sb = new StringBuffer();
            for(int j = 0; j < arr[i].length(); j++) {
                char ch = arr[i].charAt(j);
                if(ch < 48 || ch > 57) {
                    answer += Integer.parseInt(sb.toString());
                    break;
                }
                sb.append(ch);
            }
        }
        System.out.print(answer);
    }
}