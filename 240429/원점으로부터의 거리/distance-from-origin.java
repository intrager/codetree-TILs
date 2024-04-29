import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Point implements Comparable<Point> {
    private int distance;
    private int index;

    public Point(int distance, int index) {
        this.distance = distance;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public int compareTo(Point point) {
        if(this.distance != point.distance)
            return distance - point.distance;
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
            int distance = getDistanceFromOrigin(x, y);
            points[idx] = new Point(distance, idx + 1);
        }

        Arrays.sort(points);

        for(int i = 0; i < n; i++) {
            System.out.println(points[i].getIndex());
        }
    }

    private static int getDistanceFromOrigin(int x, int y) {
        return Math.abs(x) + Math.abs(y);
    }
}