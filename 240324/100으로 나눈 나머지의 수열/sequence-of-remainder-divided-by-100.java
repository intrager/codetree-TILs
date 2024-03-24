import java.util.*;
import java.io.*;

public class Main {
    private static int n = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        System.out.print(calculateSequence(n));
    }

    private static int calculateSequence(int n) {
        if(n == 1)
            return 2;
        if(n == 2)
            return 4;
        
        return (calculateSequence(n - 1) * calculateSequence(n - 2)) % 100;
    }
}