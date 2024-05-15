import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] binary = br.readLine().split("");
        int answer = 0;
        
        for(int i = 0; i < binary.length; i++) {
            answer = answer * 2 + Integer.parseInt(binary[i]);
        }
        System.out.print(answer);
    }
}