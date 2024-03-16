import java.util.*;
import java.io.*;

public class Main {
    private static final int MAX_N = 100;

    private static int[] arr = new int[MAX_N];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");

        for(int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        System.out.print(getMax(n - 1));
    }

    private static int getMax(int num) {
        if(num == 0)
            return arr[0];
        return Math.max(getMax(num - 1), arr[num]);
    }
}