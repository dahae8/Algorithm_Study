import java.io.*;
import java.util.*;

public class Main {
  static class xy {
    int x;
    int y;

    public xy(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  static int[][] map;
  static boolean used[][];
  static int w;
  static int h;

  static void bfs(int x, int y) {
    int[] dx = { -1, 0, 1, -1, 1, -1, 0, 1 };
    int[] dy = { -1, -1, -1, 0, 0, 1, 1, 1 };
    Queue<xy> qu = new LinkedList<>();
    qu.add(new xy(x, y));
    used[y][x] = true;
    while (!qu.isEmpty()) {
      xy cur = qu.poll();

      for (int i = 0; i < 8; i++) {
        int nx = cur.x + dx[i];
        int ny = cur.y + dy[i];
        if (nx < 0 || ny < 0 || nx >= w || ny >= h)
          continue;
        if (used[ny][nx])
          continue;
        if (map[ny][nx] == 0)
          continue;
        qu.add(new xy(nx, ny));
        used[ny][nx] = true;
      }
    }
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    w = Integer.parseInt(st.nextToken());
    h = Integer.parseInt(st.nextToken());
    StringBuilder sb = new StringBuilder();
    while (w != 0 && h != 0) {
      map = new int[h][w];
      used = new boolean[h][w];
      for (int i = 0; i < h; i++) {
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < w; j++) {
          map[i][j] = Integer.parseInt(st.nextToken());
        }
      }
      int cnt = 0;
      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
          if (used[i][j])
            continue;
          if (map[i][j] == 0)
            continue;

          bfs(j, i);
          cnt++;
        }
      }
      sb.append(cnt + "\n");
      st = new StringTokenizer(br.readLine());
      w = Integer.parseInt(st.nextToken());
      h = Integer.parseInt(st.nextToken());

    }
    System.out.println(sb);

  }
}