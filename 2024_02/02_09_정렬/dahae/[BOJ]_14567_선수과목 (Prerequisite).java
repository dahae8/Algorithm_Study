import java.io.*;
import java.util.*;

public class Main {
  static int n;
  static List<Integer> map[] = new List[1001];
  static int arr[] = new int[1001];
  static StringBuilder sb = new StringBuilder();

  static int Fun(int g) {
    int max = 1;
    if (map[g].size() == 0) {
      arr[g] = 1;
      return arr[g];
    }

    if (arr[g] != 0)
      return arr[g];

    for (int i : map[g]) {
      int k;
      if (arr[i] != 0)
        k = arr[i];
      else
        k = Fun(arr[i]);
      if (max < k + 1)
        max = k + 1;

    }
    arr[g] = max;
    return arr[g];

  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    for (int i = 1; i <= n; i++) {
      map[i] = new ArrayList<>();
    }

    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      map[b].add(a);
    }
    for (int i = 1; i <= n; i++) {
      sb.append(Fun(i)).append(" ");
    }
    System.out.print(sb);

  }
}