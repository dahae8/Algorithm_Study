import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int k = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());

    int arr[] = new int[k];
    int mn = Integer.MIN_VALUE;
    for (int i = 0; i < k; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      mn = Math.max(mn, arr[i]);
    }
    int c = 0;
    for (int i : arr) {
      c += i / mn;
    }

    if (c >= n) {
      System.out.println(mn);
      return;
    }

    long mx = mn;
    long low = 1;
    while (low < mx - 1) {
      long mid = (low + mx) / 2;

      int cnt = 0;
      for (int i : arr) {
        cnt += i / mid;
      }
      if (cnt >= n) {
        low = mid;
      } else
        mx = mid;
    }

    System.out.println(low);

  }
}