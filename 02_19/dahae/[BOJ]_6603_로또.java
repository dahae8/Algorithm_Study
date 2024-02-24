import java.io.*;
import java.util.*;

public class Main {
  static int T;
  static int arr[] = new int[13];
  static int used[] = new int[13];
  static StringBuilder sb = new StringBuilder();

  static void fun(int idx, int cnt) {
    if (cnt == 6) {
      StringBuilder s = new StringBuilder();
      for (int i = 0; i < T; i++) {
        if (used[i] == 1) {
          s.append(arr[i]).append(" ");
        }
      }
      sb.append(s.toString()).append("\n");
      return;
    }
    for (int i = idx; i < T; i++) {
      if (used[i] == 1)
        continue;
      used[i] = 1;
      fun(i + 1, cnt + 1);
      used[i] = 0;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    T = Integer.parseInt(st.nextToken());
    while (T != 0) {
      for (int i = 0; i < T; i++) {
        arr[i] = Integer.parseInt(st.nextToken());
      }
      Arrays.fill(used, 0);
      fun(0, 0);

      sb.append("\n");
      st = new StringTokenizer(br.readLine());
      T = Integer.parseInt(st.nextToken());
    }

    System.out.println(sb);
  }

}
