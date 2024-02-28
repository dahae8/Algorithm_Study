import java.io.*;
import java.util.*;

public class Main {

  static String ToString(int a) {

    String arr[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    if (a < 10) {
      return arr[a];
    } else {
      int t = a / 10;
      int o = a % 10;
      return arr[t] + " " + arr[o];
    }
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int m = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());

    List<Integer> list = new ArrayList<>();
    for (int i = m; i <= n; i++) {
      list.add(i);
    }

    Collections.sort(list, Comparator.comparing(Main::ToString));

    StringBuilder sb = new StringBuilder();
    int a = 0;
    for (int i : list) {
      a++;
      sb.append(i).append(" ");
      if (a == 10) {
        a = 0;
        sb.append("\n");
      }
    }
    System.out.print(sb);
  }
}