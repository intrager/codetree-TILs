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
        IntWrapper a = new IntWrapper(Integer.parseInt(arr[0]));
        IntWrapper b = new IntWrapper(Integer.parseInt(arr[1]));
    
        modify(a, b);

        System.out.print(a.value + " " + b.value);
    }

    private static void modify(IntWrapper a, IntWrapper b) {
        if(a.value > b.value) {
            b.value += 10;
            a.value *= 2;
        } else {
            a.value += 10;
            b.value *= 2;
        }
    }
}