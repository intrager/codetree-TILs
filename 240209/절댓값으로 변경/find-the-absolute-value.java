import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");
        int[] intArr = new int[N];
        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        
        absoluteNumber(intArr);
        for(int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
    }

    private static void absoluteNumber(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
        }
    }
}