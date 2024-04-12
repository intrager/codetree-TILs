import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Forecast {
    private String date;
    private String week;
    private String weather;

    public Forecast(String date, String week, String weather) {
        this.date = date;
        this.week = week;
        this.weather = weather;
    }

    public String getDate() {
        return date;
    }
    public String getWeek() {
        return week;
    }
    public String getWeather() {
        return weather;
    }
}

public class Main {
    public static Forecast answer = new Forecast("9999-99-99", "", "");

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            String date = st.nextToken();
            String week = st.nextToken();
            String weather = st.nextToken();
        
            Forecast comparison = new Forecast(date, week, weather);
            if(weather.equals("Rain") && answer.getDate().compareTo(comparison.getDate()) > 0) {
                answer = comparison;
            }
        }

        System.out.print(answer.getDate() + " " + answer.getWeek() + " " + answer.getWeather());
    }
}