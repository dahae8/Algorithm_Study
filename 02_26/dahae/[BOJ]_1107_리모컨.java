import com.sun.source.tree.WhileLoopTree;

import java.io.*;
import java.util.*;

public class Main {
  static Set<Integer> set = new HashSet<>();
  static int n;
  static int jarisu = 0;
  static List<Integer> list = new ArrayList<>();
  static int flnum = Integer.MAX_VALUE;
  static int minum = Integer.MIN_VALUE;

  static void fun1(int sum, int d) {
    if (d != 0 && d == jarisu - 1) {
      if (sum <= n) {
        minum = Math.max(sum, minum);
      }
    }
    if (d == jarisu + 1) {
      if (sum >= n) {
        flnum = Math.min(sum, flnum);
      }
      return;
    }
    if (d == jarisu) {
      if (sum >= n) {
        flnum = Math.min(sum, flnum);
      }
      if (sum <= n) {
        minum = Math.max(sum, minum);
      }

    }
    for (int i : set) {
      fun1((int) (sum + Math.pow(10, d) * i), d + 1);
    }
  }

  static int fun(int num) {
    if (num == 0)
      return 1;
    int resut = 0;
    while (num != 0) {
      resut++;
      num /= 10;

    }
    return resut;
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    n = Integer.parseInt(br.readLine());

    for (int i = 0; i <= 9; i++) {
      set.add(i);
    }
    int t = Integer.parseInt(br.readLine());
    int cnt = 0;

    if (n == 100) {
      System.out.println(0);
      return;
    } else if (n > 100) {
      cnt = n - 100;
    } else {
      cnt = 100 - n;
    }
    if (t == 0) {
      System.out.println(Math.min(cnt, fun(n)));
      return;
    }

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < t; i++) {
      set.remove(Integer.parseInt(st.nextToken()));
    }

    if (t == 0) {
      System.out.println(fun(n));
      return;
    }

    jarisu = fun(n);
    if (t == 10) {
      System.out.println(cnt);
      return;
    }

    fun1(0, 0);

    int f = flnum - n + fun(flnum);
    int m = n - minum + fun(minum);
    if (flnum == Integer.MAX_VALUE)
      f = Integer.MAX_VALUE;
    if (minum == Integer.MIN_VALUE)
      m = Integer.MAX_VALUE;

    System.out.println(Math.min(cnt, Math.min(f, m)));

  }
}