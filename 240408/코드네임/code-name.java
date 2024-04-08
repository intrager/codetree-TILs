import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class CodeName {
    private String name;
    private int score;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setScore(int score) {
        this.score = score;
    } 
    public int getScore() {
        return score;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = Integer.MAX_VALUE;
        CodeName code = new CodeName();

        for(int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            if(score < min) {
                min = score;
                code.setName(name);
                code.setScore(score);
            }
        }

        System.out.print(code.getName() + " " + code.getScore());
    }
}