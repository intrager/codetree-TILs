import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] binary = br.readLine().split("");
        int decimal = 0;
        for(int i = 0; i < binary.length; i++) {
            decimal = decimal * 2 + Integer.parseInt(binary[i]);
        }
        decimal *= 17;

        int[] digits = new int[20];
        int cnt = 0;
        while(true) {
            if(decimal < 2) {
                digits[cnt] = decimal;
                break;
            }

            digits[cnt++] = decimal % 2;
            decimal /= 2;
        }

        for(int i = cnt; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}