import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
    
        int n = Integer.parseInt(br.readLine());
        int[] A = Arrays.stream(br.readLine().split(" ")).sorted().mapToInt(Integer::parseInt).toArray();
        int[] B = Arrays.stream(br.readLine().split(" ")).sorted().mapToInt(Integer::parseInt).toArray();
    
        String answer = "Yes";
        for(int i = 0; i < n; i++) {
            if(A[i] != B[i]) answer = "No";
        }
        System.out.print(answer);
    }
}