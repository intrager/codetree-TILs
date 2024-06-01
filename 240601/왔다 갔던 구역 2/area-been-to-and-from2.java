import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {

    public static final int OFFSET = 1000;
    public static final int MAX_R = 2000;
    public static final int MAX_N = 100;

    public static int n;
    public static int[] left = new int[MAX_N];
    public static int[] right = new int[MAX_N];

    public static int[] checked = new int[MAX_R + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cur = 0;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int move = Integer.parseInt(st.nextToken());
            String vector = st.nextToken();

            if(vector.equals("L")) {
                left[i] = cur - move;
                right[i] = cur;
                cur -= move;
            } else {
                left[i] = cur;
                right[i] = cur + move;
                cur += move;
            }

            left[i] += OFFSET;
            right[i] += OFFSET;
        }

        for(int i = 0; i < n; i++) {
            for(int j = left[i]; j < right[i]; j++) {
                checked[j]++;
            }
        }

        int answer = 0;
        for(int i = 0; i <= MAX_R; i++) {
            if(checked[i] >= 2) {
                answer++;
            }
        }
        System.out.print(answer);
    }
}