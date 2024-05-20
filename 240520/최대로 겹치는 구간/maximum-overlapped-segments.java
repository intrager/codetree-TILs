import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static final int MAX_N = 100;
    public static final int MAX_R = 200;
    public static final int OFFSET = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] x1 = new int[MAX_N];
        int[] x2 = new int[MAX_N];
        
        int[] checked = new int[MAX_R + 1];
        
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            x1[i] = Integer.parseInt(st.nextToken());
            x2[i] = Integer.parseInt(st.nextToken());
        
            x1[i] += OFFSET;
            x2[i] += OFFSET;
        }
        for(int i = 0; i < n; i++) {
            for(int j = x1[i]; j < x2[i]; j++) {
                checked[j]++;
            }
        }

        int max = 0;
        for(int i = 0; i <= MAX_R; i++) {
            if(max < checked[i]) {
                max = checked[i];
            }
        }
        System.out.print(max);
    }
}