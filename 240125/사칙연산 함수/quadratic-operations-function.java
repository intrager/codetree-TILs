import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        String o = arr[1];
        int c = Integer.parseInt(arr[2]);
    
        String answer = calculate(a, o, c);
        if(answer.equals("False")) {
            System.out.print("False");
        } else {
           System.out.print(a + " " + o + " " + c + " = " + answer);
        }
    }

    private static String calculate(int a, String o, int c) {
        String result = "";
        if (o.equals("+")) {
            result = String.valueOf(a + c);
        } else if (o.equals("-")) {
            result = String.valueOf(a - c);
        } else if (o.equals("/")) {
            result = String.valueOf(a / c);
        } else if (o.equals("*")) {
            result = String.valueOf(a * c);
        } else {
            result = "False";
        }
        return result;
    }
}