import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static final int MAX_K = 100000;

    public static int[] arr = new int[2 * MAX_K + 1];
    public static int left, right;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cur = MAX_K;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            int move = Integer.parseInt(st.nextToken());
            String vector = st.nextToken();

            if(vector.equals("L")) {
                while(move-- > 0) {
                    arr[cur] = 1;
                    if(move > 0) cur--;
                }
            } else {
                while(move-- > 0) {
                    arr[cur] = 2;
                    if(move > 0) cur++;
                }
            }
        }

        for(int i = 0; i <= 2 * MAX_K; i++) {
            if(arr[i] == 1) left++;
            else if(arr[i] == 2) right++;
        }
        System.out.print(left + " " + right);
    }
}