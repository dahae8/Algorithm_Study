import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    sb.append("<");
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    int idx = k;
    int t = 1;
    Queue<Integer> qu = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      qu.add(i + 1);
    }

    while (!qu.isEmpty()) {
      int i = qu.remove();
      if (t % k == 0) {
        sb.append(i);

        if (qu.size() == 1) {
          sb.append(", ").append(qu.remove()).append(">");
        } else if (qu.size() == 0) {
          sb.append(">");
        } else
          sb.append(", ");

      } else
        qu.add(i);
      t++;
    }

    System.out.println(sb);

  }
}
