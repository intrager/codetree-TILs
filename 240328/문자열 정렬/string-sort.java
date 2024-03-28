import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] charArr = br.readLine().split("");
        Arrays.sort(charArr);
        String answer = new String(charArr);
        System.out.print(answer);
    }
}