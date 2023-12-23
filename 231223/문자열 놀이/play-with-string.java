import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        String str = arr[0];
        int count = Integer.parseInt(arr[1]);

        while(count-- > 0) {
            String[] arr1 = br.readLine().split(" ");
            int std = Integer.parseInt(arr1[0]);
            StringBuilder sb = new StringBuilder();
            if(std == 1) {
                int a = Integer.parseInt(arr1[1])-1;
                int b = Integer.parseInt(arr1[2])-1;

                for(int i = 0; i < str.length(); i++) {
                    if(i == a) sb.append(str.charAt(b));
                    else if(i == b) sb.append(str.charAt(a));
                    else sb.append(str.charAt(i));
                }
                System.out.println(sb.toString());
            } else {
                char a = arr1[1].charAt(0);
                char b = arr1[2].charAt(0);
                for(int i = 0; i < str.length(); i++) {
                    if(str.charAt(i) == a) sb.append(b);
                    else sb.append(str.charAt(i));
                }
                System.out.println(sb.toString());
            }
            str = sb.toString();
        }
    }
}