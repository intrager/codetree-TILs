import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int stringLength = 0, countedA = 0;
        int n = Integer.parseInt(br.readLine());

        while(n-- > 0) {
            String str = br.readLine();
            for(char ch : str.toCharArray()) {
                if(ch == 'a') countedA++;
            }
            stringLength += str.length();
        }
        System.out.print(stringLength + " " + countedA);
    }
}