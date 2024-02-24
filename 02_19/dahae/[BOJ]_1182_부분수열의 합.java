import java.io.*;
import java.util.*;

public class Main {
  static int n;
  static int s;
  static int cnt = 0;
  static int arr[];
  static int used[];

  static void fun(int idx, int sum) {

    if (sum == s) {
      if (idx != 0) {
        cnt++;
      }

    }
    for (int i = idx; i < n; i++) {
      if (used[i] == 1)
        continue;
      used[i] = 1;
      fun(i + 1, sum + arr[i]);
      used[i] = 0;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    s = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    arr = new int[n];
    used = new int[n];
    Arrays.fill(used, 0);
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    fun(0, 0);

    System.out.println(cnt);
  }

}
