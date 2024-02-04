import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        String[] arr1 = br.readLine().split(" ");
        int[] arr2 = new int[N];
        for(int i = 0; i < N; i++) {
            arr2[i] = Integer.parseInt(arr1[i]);
        }

        modify(arr2);
        for(int i = 0; i < N; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    private static void modify(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) arr[i] = arr[i] / 2;
        }   
    }
}