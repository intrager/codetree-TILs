import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] week = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] arr = br.readLine().split(" ");

        int m1 = Integer.parseInt(arr[0]);
        int d1 = Integer.parseInt(arr[1]);
        int m2 = Integer.parseInt(arr[2]);
        int d2 = Integer.parseInt(arr[3]);
    

        int days1 = 0;
        int days2 = 0;
        for(int i = 0; i < m1; i++) {
            days1 += days[i];
        }
        days1 += d1;

        for(int i = 0; i < m2; i++) {
            days2 += days[i];
        }
        days2 += d2;


        int answer = 0;
        if(days2 > days1) {
            answer = (days2 - days1) % 7 + 1;
        } else if(days2 < days1) {
            answer = (days1 - days2) % 7 - 1;
        } else {
            answer = (days2 - days1) % 7 + 1;
        }
        System.out.print(week[answer]);
    }
}