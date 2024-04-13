import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Student implements Comparable<Student> {
    private String name;
    private int height;
    private int weight;

    public Student(String name, int height, int weight) {
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
    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Student student) {
        return this.height - student.height; // 오름차순
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Student[] students = new Student[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            
            students[i] = new Student(name, height, weight);
        }

        Arrays.sort(students);

        for(int i = 0; i < n; i++) {
            System.out.println(students[i].getName() + " " + students[i].getHeight() + " " + students[i].getWeight());
        }
    }
}