import java.io.*;
import java.util.*;

public class Main {
  static Map<Integer, Integer> map;
  static int cnt;
  static int n;
  static int[] used;

  static void fun(int idx) {
    if (used[idx] == 1) {
      return;
    }
    used[idx] = 1;
    int k = map.get(idx);
    fun(k);

  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int T = Integer.parseInt(br.readLine());
    for (int tc = 0; tc < T; tc++) {
      n = Integer.parseInt(br.readLine());

      map = new HashMap<>();
      cnt = 0;
      used = new int[n + 1];

      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int i = 1; i <= n; i++) {
        map.put(i, Integer.parseInt(st.nextToken()));
      }
      for (int i = 1; i <= n; i++) {
        if (used[i] == 1) {
          continue;
        }
        fun(i);
        cnt++;
      }

      sb.append(cnt).append("\n");

    }
    System.out.println(sb);

  }
}