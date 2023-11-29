import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[10];
        int len = arr.length;

        for(int i = 0; i < len; i++) {
            arr[i] = br.readLine();
        }
        
        char ch = br.readLine().toCharArray()[0];

        List<String> list = new ArrayList<>();
        for(int i = 0; i < len; i++) {
            if(arr[i].charAt(arr[i].length()-1) == ch) {
                list.add(arr[i]);
            }
        }

        if(list.size() == 0) {
            System.out.print("None");
        } else {
            for(int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
}