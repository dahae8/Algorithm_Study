import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    List<Integer> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < n; j++) {
        int s = Integer.parseInt(st.nextToken());
        arr.add(s);
      }
    }
    Collections.sort(arr, Collections.reverseOrder());
    System.out.println(arr.get(n - 1));

  }

}
