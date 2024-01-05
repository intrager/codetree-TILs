import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        while(n-- > 0) {
            sum += Integer.parseInt(br.readLine());
        }
        String answer = String.valueOf(sum);
        answer = answer.substring(1, answer.length()) + answer.substring(0, 1);
        System.out.print(answer);
    }
}