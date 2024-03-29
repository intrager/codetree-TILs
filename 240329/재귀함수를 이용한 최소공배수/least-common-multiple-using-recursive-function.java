import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static final int MAX_SIZE = 10;
    public static int[] arr = new int[MAX_SIZE + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");

        for(int i = 0; i < MAX_SIZE; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        
        System.out.print(getLCMAll(n));
    }

    // index번째까지 인덱스의 숫자 중에 가장 큰 값을 반환한다.
    private static int getLCMAll(int idx) {
        // 남은 원소가 1개라면 그 자신이 답이 된다.
        if(idx == 1)
            return arr[1];
        
        // 1번째 ~ index - 1번째 원소의 최소공배수를 구한 결과와
        // 현재 index 원소의 최소공배수를 구하여 반환한다.
        return getLCM(getLCMAll(idx - 1), arr[idx]);
    }

    private static int getLCM(int a, int b) {
        int gcd = 1;
        for(int i = 1; i <= Math.min(a, b); i++) {
            if(a % i == 0 && b % i == 0)
                gcd = i;
        }
        return a * b / gcd;
    }

}