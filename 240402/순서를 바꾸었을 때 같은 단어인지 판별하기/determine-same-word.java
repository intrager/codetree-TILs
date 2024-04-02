import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a = br.readLine().toLowerCase().split("");
        String[] b = br.readLine().toLowerCase().split("");

        Arrays.sort(a);
        Arrays.sort(b);

        String answer = "Yes";
        if(a.length != b.length) {
            answer = "No";
            System.out.print(answer);
            return ;
        }
        for(int i = 0; i < a.length; i++) {
            if(!a[i].equals(b[i])) {
                answer = "No";
            }
        }
        System.out.print(answer);
    }
}