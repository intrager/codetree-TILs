import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Student implements Comparable<Student> {
    private String name;
    private int korean;
    private int english;
    private int math;
    private int total;

    public Student(String name, int korean, int english, int math, int total) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.total = total;
    }

    public String getName() {
        return name;
    }
    public int getKorean() {
        return korean;
    }
    public int getEnglish() {
        return english;
    }
    public int getMath() {
        return math;
    }
    public int getTotal() {
        return total;
    }

    @Override
    public int compareTo(Student student) { 
        return this.total - student.getTotal();
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
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            int total = korean + english + math;

            students[i] = new Student(name, korean, english, math, total);
        }

        Arrays.sort(students);

        for(int i = 0; i < n; i++) {
            System.out.println(students[i].getName() + " " + students[i].getKorean() + " " + students[i].getEnglish() + " " + students[i].getMath());
        }
    }
}