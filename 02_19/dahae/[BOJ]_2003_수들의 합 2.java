import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int arr[] = new int[n];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int cnt = 0;
    for (int i = 0; i < n; i++) {
      int x = 0;

      for (int j = i; j < n; j++) {
        x += arr[j];
        if (x > m)
          break;
        if (x == m) {
          cnt++;
          break;
        }
      }
      if (x < m)
        break;
    }
    System.out.println(cnt);
  }

}
