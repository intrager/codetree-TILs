import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();
        int index = -1;
    
        for(int i = 1; i <= A.length(); i++) {
            A = A.substring(A.length()-1, A.length()) + A.substring(0, A.length()-1);
            if(A.equals(B)) {
                index = i;
                break;
            }
        }
        System.out.print(index);
    }
}