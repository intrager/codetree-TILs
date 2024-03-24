import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.print(getSequence(n));
    }

    private static int getSequence(int n) {
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        return n/3 + getSequence(n - 1);
    }
}