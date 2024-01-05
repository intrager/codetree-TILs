import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String A = st.nextToken();
        String B = st.nextToken();

        int AB = Integer.parseInt(A + B);
        int BA = Integer.parseInt(B + A);
        System.out.print(AB + BA);
    }
}