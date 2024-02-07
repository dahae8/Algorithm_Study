import java.io.*;
import java.util.*;

public class Main {
  static StringBuilder sb = new StringBuilder();
  static int n;

  static void fun(int b) {
    int x = b / n;
    int y = b % n;

    if (x == 0) {
      if (y > 9) {
        sb.append((char) (65 + y - 10));
      } else
        sb.append(y);
    } else {
      fun(x);
      if (y > 9) {
        sb.append((char) (65 + y - 10));
      } else
        sb.append(y);
    }

  }

  public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    n = b;
    fun(a);

    System.out.print(sb);

  }
}