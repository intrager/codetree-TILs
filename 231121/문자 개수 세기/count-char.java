import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String alpha = br.readLine();

        int count = 0;
        for(int i = 0; i < line.length(); i++) {
            if(Character.toString(line.charAt(i)).equals(alpha)) count++;
        }
        System.out.print(count);
    }
}