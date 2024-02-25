import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    int arr[] = new int[20000001];
    for (int i = 0; i < n; i++) {
      arr[Integer.parseInt(st.nextToken()) + 10000000]++;
    }

    int m = Integer.parseInt(br.readLine());

    st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < m; i++) {
      int c = Integer.parseInt(st.nextToken());
      sb.append(arr[c + 10000000]);
      sb.append(" ");
    }

    System.out.println(sb);

  }
}