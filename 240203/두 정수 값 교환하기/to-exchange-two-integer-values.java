import java.util.*;
import java.io.*;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        IntWrapper n = new IntWrapper(Integer.parseInt(arr[0]));
        IntWrapper m = new IntWrapper(Integer.parseInt(arr[1]));
    
        switchValue(n, m);
        System.out.print(n.value + " " + m.value);
    }

    private static void switchValue(IntWrapper n, IntWrapper m) {
        int temp = n.value;
        n.value = m.value;
        m.value = temp;
    }
}