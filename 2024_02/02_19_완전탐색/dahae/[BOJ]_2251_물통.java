import com.sun.source.tree.WhileLoopTree;

import java.io.*;
import java.util.*;

public class Main {
  static int a;
  static int b;
  static int c;

  static int rr[] = new int[3];
  static int arr[];

  static TreeSet<Integer> list = new TreeSet<>();

  static void fun(int idx) {
    if (arr[0] == 0) {
      if (list.contains(arr[2]))
        return;
      list.add(arr[2]);
    }
    for (int i = 0; i < 3; i++) {
      if (idx != i && arr[i] != rr[i]) {
        int s = arr[idx];
        int e = rr[i] - arr[i];
        if (e >= s) {
          arr[i] += s;
          arr[idx] = 0;
          fun(i);
          arr[i] -= s;
          arr[idx] = s;
        } else {
          arr[i] = rr[i];
          arr[idx] -= e;
          fun(i);
          arr[i] = rr[i] - e;
          arr[idx] += e;
        }

      }
    }
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    a = Integer.parseInt(st.nextToken());
    b = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());
    rr = new int[] { a, b, c };
    arr = new int[] { 0, 0, c };

    fun(2);
    StringBuilder sb = new StringBuilder();
    for (int s : list) {
      sb.append(s + " ");
    }
    System.out.println(sb);

  }
}