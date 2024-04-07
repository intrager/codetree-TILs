import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class UserLevel {
    private String id;
    private int level;

    public UserLevel() {
        this.id = "codetree";
        this.level = 10;
    }

    public UserLevel(String id, int level) {
        this.id = id;
        this.level = level;
    }

    public getId() {
        return id;
    }

    public getLevel() {
        return level;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String userId = st.nextToken();
        int userLevel = Integer.parseInt(st.nextToken());

        UserLevel defaultInfo = new UserLevel();
        UserLevel newInfo = new UserLevel(userId, userLevel);

        System.out.println("user " + defaultInfo.getId() + " lv " + defaultInfo.getLevel());
        System.out.print("user " + newInfo.getId() + " lv " + newInfo.getLevel());
    }
}