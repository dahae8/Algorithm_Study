import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    st = new StringTokenizer(bf.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int m = Integer.parseInt(bf.readLine());

    st = new StringTokenizer(bf.readLine());

    int rnum = 0;
    for (int i = m - 1; i >= 0; i--) {
      int k = Integer.parseInt(st.nextToken());
      if (m == 1 & k == 0) {
        System.out.print(0);
        return;

      }
      rnum += Math.pow(a, i) * k;
    }

    int r;
    while (rnum != 0) {
      r = rnum % (b);
      rnum = rnum / (b);
      if (r > 9) {
        sb.append(new StringBuffer(Integer.toString(r)).reverse());
      } else {
        sb.append(r);
      }
      if (rnum == 0) {
        break;
      }
      sb.append(" ");
    }

    System.out.print(sb.reverse());
  }
}