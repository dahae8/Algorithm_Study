import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Point[] points = new Point[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            points[i] = new Point(x, y);
        }

        // 배열 -> 리스트
        // 가변크기리스트 ArrayList 복사
        List<Point> pointList = new ArrayList<>(Arrays.asList(points));

        // 정렬
        pointList.sort(Comparator.comparing(Point::getY).thenComparing(Point::getX));

        StringBuilder sb = new StringBuilder();
        for (Point point : pointList ) {
            sb.append((int)point.getX()).append(" ").append((int)point.getY()).append("\n");
        }
        System.out.print(sb);
    }
}