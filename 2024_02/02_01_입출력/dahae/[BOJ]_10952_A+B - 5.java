import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    while (true) {
      st = new StringTokenizer(bf.readLine());
      int a = Integer.parseInt(st.nextToken());
      if (a == 0)
        break;
      int b = Integer.parseInt(st.nextToken());
      sb.append(a + b).append("\n");
    }
    System.out.println(sb);

  }
}