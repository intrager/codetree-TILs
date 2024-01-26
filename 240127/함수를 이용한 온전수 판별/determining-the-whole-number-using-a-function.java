import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
    
        int answer = 0;
        for(int i = a; i <= b; i++) {
            if(isMagicnumber(i)) {
                answer++;
            }
        }
        System.out.print(answer);
    }
    
    private static boolean isMagicnumber(int num) {
        String str = String.valueOf(num);

        return !(num % 2 == 0 || str.charAt(str.length() - 1) == '5' || (num % 3 == 0 && num % 9 != 0));
    }
}