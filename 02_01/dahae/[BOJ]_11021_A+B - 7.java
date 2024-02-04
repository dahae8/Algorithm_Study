import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    StringTokenizer st;

    int t = Integer.parseInt(bf.readLine());

    for (int i = 1; i <= t; i++) {
      sb.append("Case #").append(i).append(": ");
      st = new StringTokenizer(bf.readLine());

      int a, b;
      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());
      sb.append(a + b).append("\n");
    }

    System.out.println(sb);
  }
}