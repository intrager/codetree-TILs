import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] x1 = new int[100];
        int[] x2 = new int[100];
        
        int[] checked = new int[101];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            x1[i] = Integer.parseInt(st.nextToken());
            x2[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++) {
            for(int j = x1[i]; j <= x2[i]; j++) {
                checked[j]++;
            }
        }

        int answer = 0;
        for(int i = 0; i <= 100; i++) {
            if(answer < checked[i]) {
                answer = checked[i];
            }
        }

        System.out.print(answer);
    }
}