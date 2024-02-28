import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      int arr[] = new int[265];
      for (char c : br.readLine().toCharArray()) {
        if (c == ' ')
          continue;
        arr[c]++;
      }
      String result;
      char a = 'z';
      int cnt = arr['z'];
      result = String.valueOf(a);
      for (int k = 'a'; k < 'z'; k++) {
        if (arr[a] < arr[k]) {
          a = (char) k;
          result = String.valueOf(a);
        } else if (arr[a] == arr[k]) {
          result = "?";
        }
      }
      sb.append(result).append("\n");
    }
    System.out.println(sb);
  }

  static String ToString(int x) {
    StringBuilder sb = new StringBuilder();
    if (x < 10)
      return sb.append("0").append(x).toString();
    else
      return sb.append(x).toString();
  }
}
