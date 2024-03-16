import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] intArr = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }

        System.out.print(getMax(intArr, 0, intArr[0]));
    }

    private static int getMax(int[] arr, int count, int max) {
        if(count == arr.length - 1)
            return max;
        count++;
        return getMax(arr, count, Math.max(arr[count], max));
    }
}