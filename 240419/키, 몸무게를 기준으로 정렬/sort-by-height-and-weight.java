import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Person implements Comparable<Person> {
    private String name;
    private int height;
    private int weight;

    public Person(String name, int height, int weight) {
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

    public int compareTo(Person person) {
        if(this.height != person.height)
            return this.height - person.height;
        return person.weight - this.weight;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Person[] people = new Person[n];
    
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            
            people[i] = new Person(name, height, weight);
        }

        Arrays.sort(people);
        for(int i = 0; i < n; i++) {
            System.out.println(people[i].getName() + " " + people[i].getHeight() + " " + people[i].getWeight());
        }
    }
}