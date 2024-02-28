import java.io.*;
import java.util.*;

public class Main {
  static int n;
  static int arr[][];
  static int mn = Integer.MAX_VALUE;
  static boolean used[];

  static void fun(int idx, int sum, int d) {
    if (d == n - 1) {
      if (arr[idx][0] != 0)
        mn = Math.min(mn, sum + arr[idx][0]);
      return;
    }
    for (int i = 0; i < n; i++) {
      if (i == 0)
        continue;
      if (used[i])
        continue;
      if (arr[idx][i] == 0)
        continue;

      used[i] = true;
      fun(i, sum + arr[idx][i], d + 1);
      used[i] = false;
    }
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());

    arr = new int[n][n];
    used = new boolean[n];

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < n; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    Arrays.fill(used, false);
    fun(0, 0, 0);

    System.out.println(mn);

  }
}