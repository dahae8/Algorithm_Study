import java.io.*;
import java.util.*;

public class Main {
  static int fun(int cur, int p) {
    int sum = 0;

    while (cur > 0) {
      int a = cur % 10;
      sum += Math.pow(a, p);
      cur = cur / 10;
    }
    return sum;
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int p = Integer.parseInt(st.nextToken());
    Map<Integer, Integer> map = new HashMap<>();
    Queue<Integer> qu = new LinkedList<>();
    qu.add(a);
    int cnt = 0;
    while (!qu.isEmpty()) {
      int cur = qu.poll();
      if (map.containsKey(cur)) {
        System.out.println(map.get(cur) - 1);
        return;
      }

      else {
        cnt++;
        map.put(cur, cnt);
        qu.add(fun(cur, p));
      }

    }

  }
}