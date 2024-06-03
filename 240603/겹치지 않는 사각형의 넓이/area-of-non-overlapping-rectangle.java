import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static final int OFFSET = 1000;
    public static final int MAX = 2000;

    public static int[] x1 = new int[3];
    public static int[] x2 = new int[3];
    public static int[] y1 = new int[3];
    public static int[] y2 = new int[3];

    public static int[][] checked = new int[MAX + 1][MAX + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 3; i++) {
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

        for(int i = 0; i < 3; i++) {
            for(int x = x1[i]; x < x2[i]; x++) {
                for(int y = y1[i]; y < y2[i]; y++) {
                    checked[x][y] = i + 1;
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i <= MAX; i++) {
            for(int j = 0; j <= MAX; j++) {
                if(checked[i][j] == 1 || checked[i][j] == 2) {
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}