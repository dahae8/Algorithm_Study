import java.io.*;
import java.util.StringTokenizer;

public class Main {
  static int fun(int f) {
    int tot2 = 0;
    int tot5 = 0;
    for (int i = 2; i <= f; i++) {
      int i2 = i;
      while (true) {
        if (i2 % 2 == 0) {
          tot2++;
          i2 /= 2;
        } else
          break;
      }
      int i5 = i;
      while (true) {
        if (i2 % 5 == 0) {
          tot5++;
          i2 /= 5;
        } else
          break;
      }
    }
    return Math.min(tot2, tot5);

  }

  public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int k = n - m;

    int r = fun(n) - fun(m) - fun(k);
    System.out.print(r);

  }
}