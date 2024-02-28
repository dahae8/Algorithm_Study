import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    PriorityQueue<Long> pq = new PriorityQueue<>(Comparator.reverseOrder());
    for (int i = 0; i < n; i++) {
      Long s = Long.parseLong(br.readLine());
      if (s == 0) {
        if (pq.isEmpty()) {
          sb.append(0);
        } else {
          sb.append(pq.poll());
        }
        sb.append("\n");

      } else {
        pq.add(s);

      }
    }
    System.out.println(sb);

  }

}
