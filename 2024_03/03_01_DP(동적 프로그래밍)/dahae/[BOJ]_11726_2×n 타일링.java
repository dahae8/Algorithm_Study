import java.io.*;
import java.util.*;

public class Main {
  static long brr[] = { 0, 1, 2, 3 };
  static long arr[];

  static long fun(int n) {
    if (arr[n] != 0)
      return arr[n];
    if (n < brr.length) {
      arr[n] = brr[n];
      return arr[n];
    }

    arr[n] = (fun(n - 1) + fun(n - 2)) % 10007;
    return arr[n];

  }

  public static void main(String args[]) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    arr = new long[n + 1];
    System.out.println(fun(n));

  }
}
