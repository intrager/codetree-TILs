import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();
        if(a == null || b == null) {
            System.out.print("No");
            return;
        }
        
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        String sortedA = new String(arrA);
        String sortedB = new String(arrB);

        if(sortedA.equals(sortedB)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}