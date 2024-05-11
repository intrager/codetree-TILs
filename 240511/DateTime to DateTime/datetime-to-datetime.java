import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        int startMinutes = 10 * 24 * 60 + 10 * 60 + 11;
        int endMinutes = (a - 1) * 24 * 60 + (b > 0 ? b - 1 : b) * 60 + c;
        
        if(endMinutes < startMinutes)
            System.out.print(-1);
        else System.out.print(endMinutes - startMinutes);
    }
}