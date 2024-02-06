import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());
    StringBuilder sb = new StringBuilder();
    int a, b;
    a = Integer.parseInt(st.nextToken());
    b = Integer.parseInt(st.nextToken());

    int[] arr;

    int mn, mx;
    if (a < b) {
      mn = a;
      mx = b;
    } else {
      mn = b;
      mx = a;
    }

    for (int i = mn; i >= 1; i--) {
      if (mn % i == 0) {
        if (mx % i == 0) {
          sb.append(i).append("\n");
          break;
        }
      }
    }
    int j = 1;
    while (true) {
      int c = mx * j;
      if (c % mn == 0) {
        sb.append(c);
        break;
      }
      j++;
    }
    System.out.print(sb);

  }

}