import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      int a, b;
      st = new StringTokenizer(br.readLine());
      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());
      sb.append(a + b).append("\n");
    }
    System.out.println(sb);
  }
}
