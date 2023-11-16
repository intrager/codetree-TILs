import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        String a = arr[0];
        String b = arr[1];

        int alen = a.length();
        int blen = b.length();
        if(alen == blen) System.out.print("same");
        else if(alen > blen) System.out.print(a + " " + alen);
        else System.out.print(b + " " + blen);
    }
}