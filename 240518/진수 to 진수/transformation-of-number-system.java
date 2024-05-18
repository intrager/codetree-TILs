import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        String[] n = br.readLine().split("");
        int decimal = 0;
        for(int i = 0; i < n.length; i++) {
            decimal = decimal * a + Integer.parseInt(n[i]);
        }

        int[] answer = new int[20];
        int cnt = 0;

        while(true) {
            if(decimal < b) {
                answer[cnt] = decimal;
                break;
            }

            answer[cnt++] = decimal % b;
            decimal /= b;
        }

        for(int i = cnt; i >= 0; i--) {
            System.out.print(answer[i]);
        }
    }
}