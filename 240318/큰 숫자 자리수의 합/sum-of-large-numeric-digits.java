import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        BigInteger a = new BigInteger(arr[0]);
        BigInteger b = new BigInteger(arr[1]);
        BigInteger c = new BigInteger(arr[2]);

        String bigNumber = c.multiply(a.multiply(b)).toString();
    
        int sum = 0;
        for(int i = 0; i < bigNumber.length(); i++) {
            sum += bigNumber.charAt(i) - '0';
        }
        System.out.print(sum);
    }
}