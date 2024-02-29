import java.io.*;
import java.util.*;

public class Main {
  static long brr[] = { 0, 1, 3, 5 };
  static long arr[];

  static long fun(int n) {
    if (arr[n] != 0)
      return arr[n];
    if (n == 0) {
      return 1;
    }
    long a = 0;
    if (n - 1 >= 0) {
      a = fun(n - 1);
    }

    long b = 0;
    if (n - 2 >= 0) {
      b = fun(n - 2);
    }

    long c = 0;
    if (n - 3 >= 0) {
      c = fun(n - 3);
    }

    arr[n] = a + b + c;
    return arr[n];

  }

  public static void main(String args[]) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int tc = 0; tc < t; tc++) {
      int n = Integer.parseInt(br.readLine());
      arr = new long[n + 1];
      sb.append(fun(n) + "\n");
    }

    System.out.println(sb);

  }
}
