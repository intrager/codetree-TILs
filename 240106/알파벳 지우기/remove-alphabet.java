import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;

        while(br.ready()) {
            StringBuffer sb = new StringBuffer();
            String str = br.readLine();
            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(ch > 46 && ch < 58) {
                    sb.append(ch);
                }
            }
            answer += Integer.parseInt(sb.toString());
        }
        System.out.print(answer);
    }
}