import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            sb.append(st.nextToken());
        }

        String answer = sb.toString();
        int len = sb.toString().length();
        int size = len / 5;
        for(int i = 0; i < size; i++) {
            System.out.println(answer.substring(0, 5));
            answer = answer.substring(5);
        }
        System.out.print(answer.substring(0));
    }
}