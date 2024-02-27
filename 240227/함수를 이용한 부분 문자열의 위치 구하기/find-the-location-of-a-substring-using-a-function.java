import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputString = br.readLine();
        String objectString = br.readLine();

        int index = getIndex(inputString, objectString);
        System.out.print(index);
    }

    public static int getIndex(String base, String object) {
        int index = -1;

        index = base.indexOf(object);
        return index;
    }
}