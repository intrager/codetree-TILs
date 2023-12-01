import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Sring str = br.readLine();
        for(char ch : str.toCharArray()) {
            System.out.println(ch);
        }
    }
}