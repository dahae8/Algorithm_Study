import com.sun.source.tree.WhileLoopTree;

import java.io.*;
import java.util.*;

public class Main {
  static int map[][];
  static boolean used[][];
  static int n;
  static int m;

  static class XY {
    int x;
    int y;
    int cnt;

    public XY(int x, int y, int cnt) {
      this.x = x;
      this.y = y;
      this.cnt = cnt;
    }
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    map = new int[n][m];
    used = new boolean[n][m];

    for (int i = 0; i < n; i++) {
      char[] crr = br.readLine().toCharArray();
      for (int j = 0; j < m; j++) {
        map[i][j] = Integer.parseInt(String.valueOf(crr[j]));
      }
    }
    Queue<XY> qu = new LinkedList<>();
    qu.add(new XY(0, 0, 1));
    int dy[] = { -1, 0, 0, 1 };
    int dx[] = { 0, -1, 1, 0 };
    used[0][0] = true;
    while (!qu.isEmpty()) {
      XY cur = qu.poll();

      for (int j = 0; j < 4; j++) {
        int ny = cur.y + dy[j];
        int nx = cur.x + dx[j];
        if (ny < 0 || nx < 0 || ny >= n || nx >= m)
          continue;
        if (map[ny][nx] == 0)
          continue;
        if (used[ny][nx])
          continue;
        if (ny == n - 1 && nx == m - 1) {
          System.out.println(cur.cnt + 1);
          return;
        }
        qu.add(new XY(nx, ny, cur.cnt + 1));
        used[ny][nx] = true;

      }
    }

  }
}