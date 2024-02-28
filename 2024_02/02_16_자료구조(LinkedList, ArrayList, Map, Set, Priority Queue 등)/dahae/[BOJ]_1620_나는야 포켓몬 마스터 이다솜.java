import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    StringBuilder sb = new StringBuilder();

    HashMap<String, Integer> hash = new HashMap<>();
    String srr[] = new String[n];
    for (int i = 0; i < n; i++) {
      String s = br.readLine();
      srr[i] = s;
      hash.put(s, i);

    }
    for (int i = 0; i < m; i++) {
      String s = br.readLine();
      if (s.toCharArray()[0] >= '0' && s.toCharArray()[0] <= '9') {
        sb.append(srr[Integer.parseInt(s) - 1]);
      } else {
        sb.append(hash.get(s) + 1);

      }
      sb.append("\n");

    }

    System.out.println(sb);

  }

}
