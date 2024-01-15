import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = divide10GetShare(addAllScope(N));
        System.out.print(answer);
    }
    private static int addAllScope(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    private static int divide10GetShare(int num) {
        return num / 10;
    }
}