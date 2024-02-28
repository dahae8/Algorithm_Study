import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    List<Integer>[] list = new List[n + 1];
    for (int i = 0; i <= n; i++) {
      list[i] = new ArrayList<>();
    }

    for (int i = 0; i < n - 1; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      list[a].add(b);
      list[b].add(a);
    }

    Queue<Integer> qu = new LinkedList<>();
    qu.add(1);

    boolean used[] = new boolean[n + 1];
    int arr[] = new int[n + 1];
    while (!qu.isEmpty()) {
      int cur = qu.poll();
      used[cur] = true;

      for (int i : list[cur]) {
        if (used[i])
          continue;
        qu.add(i);
        arr[i] = cur;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 2; i <= n; i++) {
      sb.append(arr[i] + "\n");
    }
    System.out.println(sb);

  }
}