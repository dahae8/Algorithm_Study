import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    int[] arr = new int[n];

    StringTokenizer st = new StringTokenizer(bf.readLine());
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(arr);
    int tot = 0;
    for (int i = 0; i < n; i++) {
      tot += arr[i] * (n - i);
    }
    System.out.println(tot);

  }

}
