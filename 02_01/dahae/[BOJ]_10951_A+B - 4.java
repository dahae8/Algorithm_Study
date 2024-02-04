import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    String s = bf.readLine();
    while (s != null) {
      int a, b;
      st = new StringTokenizer(s);
      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());
      sb.append(a + b).append("\n");
      s = bf.readLine();
    }
    System.out.println(sb);
  }
}