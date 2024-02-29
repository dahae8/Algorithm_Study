import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[n];
    int[] answer = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      answer[i] = arr[i];
    }

    for (int i = 1; i < n; i++) {
      if (answer[i - 1] + arr[i] > answer[i])
        answer[i] = answer[i - 1] + arr[i];
    }
    Arrays.sort(answer);
    System.out.println(answer[n - 1]);

  }
}
