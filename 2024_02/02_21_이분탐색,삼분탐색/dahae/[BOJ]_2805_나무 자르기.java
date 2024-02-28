import java.io.*;
import java.util.*;

public class Main {
  static int arr[];

  static long fun(long h) {
    long cnt = 0;
    for (int i : arr) {
      long a = i - h;
      if (a > 0)
        cnt += a;
    }
    return cnt;
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    arr = new int[n];
    long mx = Integer.MIN_VALUE;
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      mx = Math.max(mx, arr[i]);
    }

    long low = 0;
    while (low < mx - 1) {
      long mid = (low + mx) / 2;

      long cnt = fun(mid);
      if (cnt >= m) {
        low = mid;
      } else
        mx = mid;
    }

    System.out.println(low);

  }
}