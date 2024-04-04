import java.util.StringTokenizer;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String T = st.nextToken();

        List<String> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            if(str.contains(T)) {
                list.add(str);
            }
        }
        Collections.sort(list);
        System.out.print(list.get(k - 1));
    }
}