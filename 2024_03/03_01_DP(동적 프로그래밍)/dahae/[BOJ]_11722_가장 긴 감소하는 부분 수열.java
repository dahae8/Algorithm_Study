import java.io.*;
import java.util.*;

public class Main {
  static int arr[][];
  static int brr[];

  static int fun(int n, int cur) {
    if (n >= brr.length) {
      return 0;
    }

    if (arr[n][cur] != 0)
      return arr[n][cur];

    int a = 0;
    if (brr[n] < cur) {
      a = fun(n + 1, brr[n]) + 1;
    }

    int b = fun(n + 1, cur);

    arr[n][cur] = Math.max(a, b);
    return arr[n][cur];

  }

  public static void main(String args[]) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    arr = new int[t][1002];
    brr = new int[t];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < t; i++) {
      brr[i] = Integer.parseInt(st.nextToken());
    }
    System.out.println(fun(0, 1001));

  }
}
