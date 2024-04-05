import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        List<String> list = new ArrayList<>();
        
        for(int i = 1; i <= n; i+=2) {
            list.add(arr[i]);
            if(i % 2 == 1) {
                Collections.sort(list);
                System.out.print(list.get(i/2) + " ");
            }
        }
    }
}