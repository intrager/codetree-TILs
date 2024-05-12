import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] arr = br.readLine().split(" ");

        int m1 = Integer.parseInt(arr[0]);
        int d1 = Integer.parseInt(arr[1]);
        int m2 = Integer.parseInt(arr[2]);
        int d2 = Integer.parseInt(arr[3]);
    

        int days1 = 0;
        int days2 = 0;
        for(int i = 1; i < m1; i++) {
            days1 += days[i];
        }
        days1 += d1;

        for(int i = 1; i < m2; i++) {
            days2 += days[i];
        }
        days2 += d2;


        int answer = days2 - days1;
        while(answer < 0)
            answer += 7;
        answer %= 7;
        System.out.print(week[answer]);
    }
}