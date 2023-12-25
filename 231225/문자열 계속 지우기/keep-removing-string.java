import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();
        
        int index = -1; 
        while(true) {
            index = A.indexOf(B);
            if(index == -1) break;
            else {
                if(index == 0) A = A.substring(index + B.length());
                else {
                    A = A.substring(0, index) + A.substring(index + B.length());
                }
            }
        }
        System.out.print(A);
    }
}