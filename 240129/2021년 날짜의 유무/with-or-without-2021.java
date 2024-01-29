import java.util.*;
import java.io.*;
import java.time.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
    
        try {
            LocalDate date = LocalDate.of(2021, month, day);
            if(date != null) {
                System.out.print("Yes");
            }
        } catch (DateTimeException e) {
            System.out.print("No");
        }
    }
}