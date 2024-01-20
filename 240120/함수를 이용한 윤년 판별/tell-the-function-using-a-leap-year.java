import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int y = Integer.parseInt(br.readLine());
        
        if(isLeapYear(y)) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }

    private static boolean isLeapYear(int year) {
        boolean isLeap = false;
        if(year % 4 == 0) {
            isLeap = true;
        }
        if(year % 4 == 0 && year % 100 == 0) {
            isLeap = false;
        }
        if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            isLeap = true;
        }
        return isLeap;
    }
}