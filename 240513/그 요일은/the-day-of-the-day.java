import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] arr = br.readLine().split(" ");

        int m1 = Integer.parseInt(arr[0]);
        int d1 = Integer.parseInt(arr[1]);
        int m2 = Integer.parseInt(arr[2]);
        int d2 = Integer.parseInt(arr[3]);
    
        String weekDay = br.readLine().trim();

        int count = 0;
        

        int day1 = 0;
        int day2 = 0;
        for(int i = 1; i < m1; i++) {
            day1 += days[i];
        }
        day1 += d1;

        for(int i = 1; i < m2; i++) {
            day2 += days[i];
        }
        day2 += d2;
        int temp = day2 - day1;
        int answer = temp / 7;
        for(int i = 0; i < week.length; i++) {
            if(weekDay.equals(week[i]))
                count = i;
        }
        if((temp % 7) >= count) answer++;
        System.out.print(answer);
    }
}