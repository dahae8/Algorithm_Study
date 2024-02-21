import java.io.*;
import java.util.*;

public class Main {
  static int cnt = 0;

  static void fun(int n, int sum) {
    for (int i = 1; i <= 3; i++) {
      int a = sum + i;
      if (a > n)
        continue;
      if (a == n) {
        cnt++;
        continue;
      }
      fun(n, sum + i);
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();

    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      int n = Integer.parseInt(br.readLine());
      cnt = 0;
      fun(n, 0);
      sb.append(cnt).append("\n");
    }

    System.out.println(sb);
  }

}
