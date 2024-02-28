import java.io.*;
import java.util.*;

public class Main {
  static Map<Integer, TreeSet<Integer>> map;
  static int cnt;
  static int n;
  static int[] used;
  static StringBuilder sb = new StringBuilder();

  static void dfs(int idx) {
    sb.append(idx + " ");
    used[idx] = 1;
    for (int i : map.get(idx)) {
      if (used[i] == 1)
        continue;
      dfs(i);
    }

  }

  static void bfs(int idx) {
    Queue<Integer> qu = new LinkedList<>();
    qu.add(idx);
    used[idx] = 1;
    while (!qu.isEmpty()) {
      int cur = qu.poll();

      sb.append(cur + " ");
      for (int i : map.get(cur)) {
        if (used[i] == 1)
          continue;
        used[i] = 1;
        qu.add(i);
      }
    }

  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int v = Integer.parseInt(st.nextToken());
    map = new HashMap<>();
    for (int i = 0; i <= n; i++) {
      map.put(i, new TreeSet<>());
    }
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());
      map.get(s).add(e);
      map.get(e).add(s);
    }
    used = new int[n + 1];
    dfs(v);
    sb.append("\n");
    used = new int[n + 1];
    bfs(v);
    System.out.println(sb);

  }
}    