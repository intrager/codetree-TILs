import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(count > 9) count = 1;
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}