import java.io.*;
import java.util.*;

public class Main {
  static int[][] arr;

  static StringBuilder sb = new StringBuilder();

  static void fun(int[][] rr) {

    int s = rr[0][0];
    int f = 0;
    for (int crr[] : rr) {
      for (int c : crr) {
        if (s != c) {
          f = 1;
          sb.append("(");
          for (int i = 0; i < 4; i++) {
            int l = rr[0].length / 2;
            int[][] drr = new int[l][l];
            for (int j = 0; j < l; j++) {
              for (int k = 0; k < l; k++) {
                drr[j][k] = rr[(i / 2) * l + j][(i % 2) * l + k];
              }
            }
            fun(drr);
          }
          sb.append(")");
          break;
        }
      }

      if (f == 1)
        break;

    }
    if (f == 0)
      sb.append(s);

  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      char[] c = br.readLine().toCharArray();
      for (int j = 0; j < n; j++) {
        arr[i][j] = Integer.parseInt(String.valueOf(c[j]));
      }
    }
    fun(arr);
    System.out.println(sb);

  }
}