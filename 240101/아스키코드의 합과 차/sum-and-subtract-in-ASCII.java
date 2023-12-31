import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int first = (int)st.nextToken().charAt(0);
        int second = (int)st.nextToken().charAt(0);
    
        System.out.print((first+second) + " " + Math.abs(first-second));
    }
}