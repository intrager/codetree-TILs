import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class ZeroZeroSeven {
    private String code;
    private String place;
    private int time;

    public ZeroZeroSeven(String code, String place, int time) {
        this.code = code;
        this.place = place;
        this.time = time;
    }

    public String getCode() {
        return code;
    }
    public String getPlace() {
        return place;
    }
    public int getTime() {
        return time;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String code = st.nextToken();
        String place = st.nextToken();
        int hour = Integer.parseInt(st.nextToken());

        ZeroZeroSeven agent = new ZeroZeroSeven(code, place, hour);
        System.out.println("secret code : " + agent.getCode());
        System.out.println("meeting point : " + agent.getPlace());
        System.out.println("time : " + agent.getTime());
    }
}