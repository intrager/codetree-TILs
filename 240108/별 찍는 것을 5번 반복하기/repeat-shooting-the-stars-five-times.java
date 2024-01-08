import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++) {
            countingStars();
        }
    }

    public static void countingStars() {
        for(int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}