import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int answer = 0;
        for(int i = 0; i < str.length(); i++) {
            answer += (int) str.charAt(i) - 48;
        }
        System.out.print(answer);
    }
}