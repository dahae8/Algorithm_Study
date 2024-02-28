import java.io.*;
import java.util.*;

public class Main {
  static int map[][];
  static boolean used[][];
  static List<Integer> list = new ArrayList<>();

  static int acnt;
  static int n;

  static void fun(int y, int x) {
    acnt++;
    int dy[] = { -1, 0, 0, 1 };
    int dx[] = { 0, -1, 1, 0 };
    used[y][x] = true;
    for (int j = 0; j < 4; j++) {
      int ny = y + dy[j];
      int nx = x + dx[j];
      if (ny < 0 || nx < 0 || ny >= n || nx >= n)
        continue;
      if (map[ny][nx] == 0)
        continue;
      if (used[ny][nx])
        continue;
      fun(ny, nx);
    }
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    map = new int[n][n];
    used = new boolean[n][n];

    for (int i = 0; i < n; i++) {
      char[] crr = br.readLine().toCharArray();
      for (int j = 0; j < n; j++) {
        map[i][j] = Integer.parseInt(String.valueOf(crr[j]));
      }
    }
    int cnt = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (map[i][j] == 0)
          continue;
        if (used[i][j])
          continue;
        acnt = 0;
        fun(i, j);
        list.add(acnt);
        cnt++;
      }
    }

    StringBuilder sb = new StringBuilder();
    sb.append(cnt + "\n");
    Collections.sort(list);
    for (int i : list) {
      sb.append(i + "\n");
    }
    System.out.println(sb);

  }
}