import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static final int OFFSET = 100;
    public static final int MAX_N = 10;
    public static final int MAX_R = 200;
    
    public static int[][] checked = new int[MAX_R + 1][MAX_R + 1];
    public static int[] x1 = new int[MAX_N];
    public static int[] x2 = new int[MAX_N];
    public static int[] y1 = new int[MAX_N];
    public static int[] y2 = new int[MAX_N];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            x1[i] = Integer.parseInt(st.nextToken());
            y1[i] = Integer.parseInt(st.nextToken());
            x2[i] = Integer.parseInt(st.nextToken());
            y2[i] = Integer.parseInt(st.nextToken());
            
            x1[i] += OFFSET;
            y1[i] += OFFSET;
            x2[i] += OFFSET;
            y2[i] += OFFSET;
        }

        for(int i = 0; i < n; i++) {
            for(int x = x1[i]; x < x2[i]; x++) {
                for(int y = y1[i]; y < y2[i]; y++) {
                    checked[x][y]++;
                }
            }
        }

        int answer = 0;
        for(int x = 0; x <= MAX_R; x++) {
            for(int y = 0; y <= MAX_R; y++) {
                if(checked[x][y] > 0)
                    answer++;
            }
        }
        System.out.print(answer);
    }
}