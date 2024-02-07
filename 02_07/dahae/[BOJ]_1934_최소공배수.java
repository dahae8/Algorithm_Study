import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int t = Integer.parseInt(bf.readLine());

    for (int i = 0; i < t; i++) {
      st = new StringTokenizer(bf.readLine());

      int a, b;
      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());

      int mx, nm;

      if (a < b) {
        mx = b;
        nm = a;
      } else {
        mx = a;
        nm = b;
      }

      int j = 1;
      while (true) {

        int c = j * mx;
        if (c % nm == 0) {
          sb.append(c).append("\n");
          break;
        }
        j++;
      }

    }
    System.out.println(sb);
  }
}