import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String str = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        int len = str.length();

        for(int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            if (k == 1) {
                str = str.substring(1, len) + str.substring(0, 1);
            } else if (k == 2) {
                str = str.substring(len - 1, len) + str.substring(0, len - 1);
            } else {
                StringBuffer sb = new StringBuffer(str);
                str = sb.reverse().toString();
            }
            System.out.println(str);
        }
    }
}