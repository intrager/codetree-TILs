import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String base = br.readLine();
        String obj = br.readLine();

        int index = -1;
        index = base.indexOf(obj);
        System.out.print(index);
    }
}