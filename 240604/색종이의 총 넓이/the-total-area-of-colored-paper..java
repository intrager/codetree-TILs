import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {

    public static final int MAX_R = 200;
    public static final int OFFSET = 100;

    public static int[] x1 = new int[MAX_R + 1];
    public static int[] x2 = new int[MAX_R + 1];
    public static int[] y1 = new int[MAX_R + 1];
    public static int[] y2 = new int[MAX_R + 1];

    public static int[][] checked = new int[MAX_R + 1][MAX_R + 1];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            x1[i] = Integer.parseInt(st.nextToken());
            y1[i] = Integer.parseInt(st.nextToken());
            
            x1[i] += OFFSET;
            y1[i] += OFFSET;

            x2[i] = x1[i] + 8;
            y2[i] = y1[i] + 8;
        }
        
        for(int i = 0; i < n; i++) {
            for(int x = x1[i]; x < x2[i]; x++) {
                for(int y = y1[i]; y < y2[i]; y++) {
                    checked[x][y] = 1;
                }
            }
        }

        int answer = 0;
        for(int i = 0; i <= MAX_R; i++) {
            for(int j = 0; j <= MAX_R; j++) {
                if(checked[i][j] == 1) {
                    answer++;
                }
            }
        }

        System.out.print(answer);
    }
}