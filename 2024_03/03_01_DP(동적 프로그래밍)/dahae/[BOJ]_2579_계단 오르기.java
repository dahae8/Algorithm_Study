import java.io.*;
import java.util.*;

public class Main {
  static long arr[][];
  static long brr[];

  static long fun(int n, int d) {
    if (n == 0) {
      return 0;
    }
    if (arr[n][d] != 0)
      return arr[n][d];

    long a = 0;
    if (n == 1)
      a = fun(n - 1, 1) + brr[n];
    else if (d != 2 && n - 1 >= 0) {
      a = fun(n - 1, d + 1) + brr[n];
    }

    long b = 0;
    if (n - 2 >= 0) {
      b = fun(n - 2, 1) + brr[n];
    }
    arr[n][d] = Math.max(a, b);
    return arr[n][d];

  }

  public static void main(String args[]) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    arr = new long[t + 1][3];
    brr = new long[t + 1];
    for (int i = 1; i <= t; i++) {
      brr[i] = Integer.parseInt(br.readLine());
    }

    System.out.println(fun(t, 1));

  }
}
