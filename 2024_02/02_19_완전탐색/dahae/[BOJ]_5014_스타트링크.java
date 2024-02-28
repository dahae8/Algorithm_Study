import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int f = Integer.parseInt(st.nextToken());// F층으로 이루어진 고층 건물
    int s = Integer.parseInt(st.nextToken());// 강호가 지금 있는 곳
    int g = Integer.parseInt(st.nextToken());// 스타트링크가 있는 곳의 위치
    int u = Integer.parseInt(st.nextToken());// 위로 U층을 가는 버튼
    int d = Integer.parseInt(st.nextToken());// 아래로 D층을 가는 버튼
    // U층 위, 또는 D층 아래에 해당하는 층이 없을 때는, 엘리베이터는 움직이지 않는다
    int time[] = new int[f + 1];
    Queue<Integer> qu = new LinkedList<>();
    qu.offer(s);

    while (!qu.isEmpty()) {
      int cur = qu.poll();
      if (cur == g) {
        System.out.println(time[cur]);
        return;
      }

      for (int i : new int[] { cur + u, cur - d }) {
        if (i > 0 && i <= f && time[i] == 0 && cur != i) {
          time[i] = time[cur] + 1;
          qu.offer(i);
        }
      }

    }
    System.out.println("use the stairs");

  }
}