import java.util.*;
import java.io.*;
import java.time.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        
        if(judgeDay(m, d)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    // 윤년이 아닐 때 m월 d일이 존재하는지 여부 확인
    private static boolean judgeDay(int m, int d) {
        if(m <= 12 && d <= lastDayNumber(m)) {
            return true;
        } else {
            return false;
        }
    }

    // 윤년이 아닐 때 m 번째 달의 마지막 날을 반환
    private static int lastDayNumber(int m) {
        if(m == 2) {
            return 28;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        } else {
            return 31;
        }
    }
}