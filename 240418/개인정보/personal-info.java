import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

class Information {
    private String name;
    private int height;
    private double weight;

    public Information(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public int getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Information[] info = new Information[5];
        for(int i = 0; i < 5; i++) {
            String[] data = br.readLine().split(" ");
            String name = data[0];
            int height = Integer.parseInt(data[1]);
            double weight = Double.parseDouble(data[2]);

            info[i] = new Information(name, height, weight);
        }

        System.out.println("name");
        Arrays.sort(info, (i1, i2) -> i1.getName().compareTo(i2.getName()));
        for(int i = 0; i < 5; i++) {
            System.out.printf("%s %d %.1f\n", info[i].getName(), info[i].getHeight(), info[i].getWeight());
        }

        System.out.println();

        System.out.println("height");
        Arrays.sort(info, (i1, i2) -> i2.getHeight() - i1.getHeight());
        for(int i = 0; i < 5; i++) {
            System.out.printf("%s %d %.1f\n", info[i].getName(), info[i].getHeight(), info[i].getWeight());
        }
    }
}