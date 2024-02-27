import com.sun.source.tree.WhileLoopTree;

import java.io.*;
import java.util.*;

public class Main {
  static int l;
  static int c;
  static List<Character> crr = new ArrayList<>();
  static List<String> drr = new ArrayList<>();

  static StringBuilder sb = new StringBuilder();

  static char used[];

  static void fun(int idx, int d) {
    if (d == l) {
      int cnt = 0;
      for (char c : used) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
          cnt++;

        }
      }
      if (cnt > 0 && l - cnt > 1)
        drr.add(String.valueOf(used));

      return;
    }
    for (int i = idx; i < c; i++) {
      used[d] = crr.get(i);
      fun(i + 1, d + 1);
    }

  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    l = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());
    used = new char[l];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < c; i++) {
      crr.add(st.nextToken().toCharArray()[0]);
    }
    Collections.sort(crr);
    fun(0, 0);
    Collections.sort(drr);
    for (String s : drr) {
      sb.append(s + "\n");
    }
    System.out.println(sb);

  }
}