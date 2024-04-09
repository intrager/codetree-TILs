import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Product {
    private String name;
    private int code;

    public Product() {
        this.name = "codetree";
        this.code = 50;
    }

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public int getCode() {
        return code;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String name = st.nextToken();
        int code = Integer.parseInt(st.nextToken());
        
        Product product1 = new Product();
        Product product2 = new Product(name, code);
        
        System.out.println("product " + product1.getCode() + " is " + product1.getName());
        System.out.print("product " + product2.getCode() + " is " + product2.getName());
    }
}