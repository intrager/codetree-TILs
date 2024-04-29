import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Point implements Comparable<Point> {
    private int x;
    private int y;
    private int index;

    public Point(int x, int y, int index) {
        this.x = x;
        this.y = y;
        this.index = index;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getIndex() {
        return index;
    }

    @Override
    public int compareTo(Point point) {
        if(Math.abs(this.x - point.x) != Math.abs(this.y - point.y))
            return Math.abs(this.y - point.y) - Math.abs(this.x - point.x);
        return this.index - point.index;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Point[] points = new Point[n];
        for(int idx = 0; idx < n; idx++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points[idx] = new Point(x, y, idx + 1);
        }

        Arrays.sort(points);

        for(int i = 0; i < n; i++) {
            System.out.println(points[i].getIndex());
        }
    }
}