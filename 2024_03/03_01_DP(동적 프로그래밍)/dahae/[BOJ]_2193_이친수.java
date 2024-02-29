import java.io.*;
import java.util.*;

public class Main {
  static long arr[][];

  static long fun(int n, int d) {
    if (arr[n][d] != 0)
      return arr[n][d];
    if (n == 1) {
      return 1;
    }
    long a = 0;
    if (d != 1) {
      a = fun(n - 1, 1);
    }

    long b = fun(n - 1, 0);

    arr[n][d] = a + b;
    return arr[n][d];

  }

  public static void main(String args[]) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    arr = new long[t + 1][2];

    System.out.println(fun(t, 1));

  }
}
