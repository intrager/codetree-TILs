import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Student implements Comparable<Student> {
    private int height;
    private int weight;
    private int index;

    public Student(int height, int weight, int index) {
        this.height = height;
        this.weight = weight;
        this.index = index;
    }

    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }
    public int getIndex() {
        return index;
    }

    @Override
    public int compareTo(Student student) {
        if(student.height != this.height)
            return student.height - this.height;
        if(student.weight != this.weight)
            return student.weight - this.weight;
        return this.index - student.index;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Student[] students = new Student[n];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            int index = i + 1;

            students[i] = new Student(height, weight, index);
        }
        Arrays.sort(students);

        for(int i = 0; i < n; i++) {
            System.out.println(students[i].getHeight() + " " + students[i].getWeight() + " " + students[i].getIndex());
        }

    }
}