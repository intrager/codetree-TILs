import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int index = arr[0].indexOf(arr[1]);
        if(index == -1) {
            System.out.print("No");
        } else {
            System.out.print(index);
        }
    }
}