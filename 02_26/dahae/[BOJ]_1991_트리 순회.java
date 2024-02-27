import com.sun.source.tree.WhileLoopTree;

import java.io.*;
import java.util.*;

public class Main {
  static String[][] tree;
  static boolean used[];
  static int n;
  static StringBuilder sb = new StringBuilder();

  static void fun1(int idx) {
    sb.append((char) (idx + 'A'));
    for (int i = 0; i < 2; i++) {
      String next = tree[idx][i];
      if (next.equals("."))
        continue;
      fun1(next.toCharArray()[0] - 'A');
    }
  }

  static void fun2(int idx) {

    for (int i = 0; i < 2; i++) {
      String next = tree[idx][i];
      if (i == 1) {
        sb.append((char) (idx + 'A'));
      }
      if (next.equals("."))
        continue;
      fun2(next.toCharArray()[0] - 'A');

    }

  }

  static void fun3(int idx) {

    for (int i = 0; i < 2; i++) {
      String next = tree[idx][i];
      if (next.equals("."))
        continue;
      fun3(next.toCharArray()[0] - 'A');

    }
    sb.append((char) (idx + 'A'));
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    n = Integer.parseInt(br.readLine());
    tree = new String[n][2];
    used = new boolean[n];

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String a = st.nextToken();
      String b = st.nextToken();
      String c = st.nextToken();
      int d = a.toCharArray()[0] - 'A';
      tree[d][0] = b;
      tree[d][1] = c;
    }
    fun1(0);
    sb.append("\n");
    fun2(0);
    sb.append("\n");
    fun3(0);

    System.out.println(sb);

  }
}