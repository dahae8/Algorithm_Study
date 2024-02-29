import java.io.*;
import java.util.*;

public class Main {
  static int arr[];

  static int fun(int n) {
    if (n == 1)
      return 0;
    if (arr[n] != 0)
      return arr[n];

    if (n % 6 == 0) {
      arr[n] = Math.min(fun(n / 3), Math.min(fun(n / 2), fun(n - 1))) + 1;
      return arr[n];
    } else if (n % 3 == 0) {
      arr[n] = Math.min(fun(n / 3), fun(n - 1)) + 1;
      return arr[n];

    } else if (n % 2 == 0) {
      arr[n] = Math.min(fun(n / 2), fun(n - 1)) + 1;
      return arr[n];

    } else {
      arr[n] = fun(n - 1) + 1;
      return arr[n];

    }

  }

  public static void main(String args[]) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    arr = new int[n + 1];
    System.out.println(fun(n));

  }
}
