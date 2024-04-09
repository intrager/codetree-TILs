import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class AirforceEOD {
    private String code;
    private String color;
    private int second;

    public AirforceEOD(String code, String color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }

    public String getCode() {
        return code;
    }

    public String getColor() {
        return color;
    }

    public int getSecond() {
        return second;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String code = st.nextToken();
        String color = st.nextToken();
        int second = Integer.parseInt(st.nextToken());
        
        AirforceEOD eod = new AirforceEOD(code, color, second);
        System.out.println("code : " + eod.getCode());
        System.out.println("color : " + eod.getColor());
        System.out.print("second : " + eod.getSecond());
    }
}