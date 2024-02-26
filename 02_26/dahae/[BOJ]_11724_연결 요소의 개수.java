import java.io.*;
import java.util.*;

public class Main {

  static List<Integer>[] vec;
  static int cnt = 0;
  static boolean used[];

  static void fun(int idx) {
    if (used[idx])
      return;
    used[idx] = true;
    for (int i : vec[idx]) {
      if (used[i])
        continue;
      fun(i);
    }
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    vec = new List[n + 1];
    for (int i = 1; i <= n; i++) {
      vec[i] = new ArrayList<>();
    }
    used = new boolean[n + 1];
    for (int i = 1; i <= m; i++) {
      st = new StringTokenizer(br.readLine());
      int u = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());

      vec[u].add(v);
      vec[v].add(u);
    }
    for (int i = 1; i <= n; i++) {
      if (used[i])
        continue;
      fun(i);
      cnt++;
    }
    System.out.println(cnt);

  }
}