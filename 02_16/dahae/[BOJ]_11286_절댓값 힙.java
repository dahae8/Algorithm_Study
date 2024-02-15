import java.io.*;
import java.util.*;

public class Main {
  static class Fun implements Comparable<Fun> {
    String s;
    double cnt;

    public Fun(String s, double i) {
      this.s = s;
      this.cnt = i;
    }

    @Override
    public int compareTo(Fun f) {
      return (int) this.s.compareTo(f.s);
    }

  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> pu = new PriorityQueue<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        int a1 = Math.abs(o1);
        int a2 = Math.abs(o2);
        if (a1 != a2) {
          return Integer.compare(a1, a2);
        } else
          return Integer.compare(o1, o2);
      }
    });
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      int x = Integer.parseInt(br.readLine());

      if (x == 0) {
        if (pu.isEmpty()) {
          sb.append(0).append("\n");
        } else
          sb.append(pu.poll()).append("\n");
      } else {
        pu.add(x);
      }

    }

    System.out.println(sb);

  }

}
