import java.io.*;
import java.util.*;

public class Main {
  static int[][] arr;

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < n; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    Queue<int[][]> qu = new LinkedList<>();
    qu.add(arr);

    int p = 0;
    int o = 0;
    int u = 0;

    while (!qu.isEmpty()) {
      int brr[][] = qu.poll();
      int s = brr[0][0];
      int f = 0;
      for (int crr[] : brr) {
        for (int c : crr) {
          if (s != c) {
            f = 1;
            for (int i = 0; i < 9; i++) {
              int l = brr[0].length / 3;
              int[][] drr = new int[l][l];
              for (int j = 0; j < l; j++) {
                for (int k = 0; k < l; k++) {
                  drr[j][k] = brr[(i / 3) * l + j][(i % 3) * l + k];
                }
              }
              qu.add(drr);
            }
            break;
          }
        }
        if (f == 1)
          break;
      }
      if (f == 1)
        continue;

      if (s == -1) {
        p++;
      } else if (s == 0) {
        o++;
      } else {
        u++;
      }
    }

    StringBuilder sb = new StringBuilder();
    sb.append(p).append("\n").append(o).append("\n").append(u);

    System.out.println(sb);

  }
}