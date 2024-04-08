import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class User {
    char codeName;
    int score;

    public User(char codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = 5;
        User[] users = new User[len];

        for(int i = 0; i < len; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            char codeName = st.nextToken().charAt(0);
            int score = Integer.parseInt(st.nextToken());

            users[i] = new User(codeName, score);
        }

        int minIndex = 0;

        for(int i = 1; i < len; i++) {
            if(users[minIndex].score > users[i].score)
                minIndex = i;
        }
        System.out.print(users[minIndex].codeName + " " + users[minIndex].score);
    }
}