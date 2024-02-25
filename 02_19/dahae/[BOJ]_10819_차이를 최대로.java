import java.io.*;
import java.util.*;

public class Main {
  static int n;
  static int arr[];
  static int mx = Integer.MIN_VALUE;
  static int brr[];
  static boolean used[];

  static void fun(int idx) {
    if (idx == n) {
      int a = 0;
      for (int i = 0; i < n - 1; i++) {
        a += Math.abs(brr[i] - brr[i + 1]);
      }
      if (mx < a)
        mx = a;
      return;
    }
    for (int i = 0; i < n; i++) {
      if (used[i])
        continue;
      used[i] = true;
      brr[idx] = arr[i];
      fun(idx + 1);
      used[i] = false;
    }
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());

    arr = new int[n];
    brr = new int[n];
    used = new boolean[n];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    fun(0);
    System.out.println(mx);

  }
}