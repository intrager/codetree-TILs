import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.util.StringTokenizer;

class TheDay {
    private LocalDate date;
    private String week;
    private String weather;

    public LocalDate getDate() {
        return date;
    }
    public String getWeek() {
        return week;
    }
    public String getWeather() {
        return weather;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setWeek(String week) {
        this.week = week;
    }
    public void setWeather(String weather) {
        this.weather = weather;
    }
    
}

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        TheDay theDay = new TheDay();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String[] arr = st.nextToken().split("-");
            int year = Integer.parseInt(arr[0]);
            int month = Integer.parseInt(arr[1]);
            int day = Integer.parseInt(arr[2]);
            
            LocalDate date = LocalDate.of(year, month, day);
            
            String week = st.nextToken();
            String weather = st.nextToken();
            
            if(!weather.equals("Rain")) continue;

            if(theDay.getWeather() == null) {
                theDay.setDate(date);
                theDay.setWeek(week);
                theDay.setWeather(weather);
            }

            if(date.isBefore(theDay.getDate())) {
                theDay.setDate(date);
                theDay.setWeek(week);
                theDay.setWeather(weather);
            }
        }
        System.out.print(theDay.getDate().toString() + " " + theDay.getWeek() + " " + theDay.getWeather());
    }
}