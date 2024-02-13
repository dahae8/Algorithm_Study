import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫째 줄에 점의 개수 N
        int N = Integer.parseInt(br.readLine());

        Point[] points = new Point[N];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            StringTokenizer st = new StringTokenizer(input);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            //   points[i] = new Point() : (0,0)으로 할당
            //   특정 값 넣기 위해서는 값 할당
            points[i] = new Point(x, y);
        }
        /*------------------------------------------------------
        // x 좌표를 기준으로 정렬
        Arrays.sort(points, Comparator.comparing(Point::getX));
        // y 좌표를 기준으로 정렬
        Arrays.sort(points, Comparator.comparing(Point::getY));
        // Comparator : double값 반환 -> 형변환 해줘야됨
        -------------------------------------------------------*/
        Arrays.sort(points, Comparator.comparing(Point::getX).thenComparing(Point::getY));

        StringBuilder sb = new StringBuilder();
        for ( Point point : points ){
            sb.append((int)point.getX()).append(" ").append((int)point.getY()).append("\n");
        }
        System.out.print(sb);
    }
}