import java.util.Arrays;
import java.util.Collections;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        Integer[] answerArray = Arrays.stream(arr)
                                      .sorted()
                                      .boxed()
                                      .toArray(Integer[]::new);
        
        for(int i = 0; i < n; i++) {
            System.out.print(answerArray[i] + " ");
        }
        System.out.println();

        Arrays.sort(answerArray, Collections.reverseOrder());
        for(int i = 0; i < n; i++) {
            System.out.print(answerArray[i] + " ");
        }
    }
}