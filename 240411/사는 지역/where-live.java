import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Local {
    private String name;
    private String street;
    private String region;

    public String getName() {
        return name;
    }
    public String getStreet() {
        return street;
    }
    public String getRegion() {
        return region;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        List<Local> list = new ArrayList<>();
        Local citizen = new Local();
        String finalName = "a";
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String street = st.nextToken();
            String region = st.nextToken();
            
            if(finalName.compareTo(name) < 0) {
                finalName = name;
                citizen.setName(name);
                citizen.setStreet(street);
                citizen.setRegion(region);
            }

        }
        
        System.out.println("name " + citizen.getName());
        System.out.println("addr " + citizen.getStreet());
        System.out.print("city " + citizen.getRegion());
    }
}