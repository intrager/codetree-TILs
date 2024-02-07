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
    
        calculate(a, b);
        System.out.print(a.value + " " + b.value);
    }

    private static void calculate(IntWrapper a, IntWrapper b) {
        if(a.value > b.value) {
            a.value += 25;
            b.value *= 2;
        } else {
            a.value *= 2;
            b.value += 25;
        }
    }
}