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
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            list.add(Integer.valueOf(arr[i]));
            if(i % 2 == 0) {
                Collections.sort(list);
                System.out.print(list.get(i/2) + " ");
            }
        }
    }
}