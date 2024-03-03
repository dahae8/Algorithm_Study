import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int cnt = 0;
    if (n == 1) {
      cnt = 1;
    } else if (n == 2) {
      if (m < 3)
        cnt = 1;
      else if (m < 5)
        cnt = 2;
      else if (m < 7)
        cnt = 3;
      else
        cnt = 4;
    } else {
      if (m == 1)
        cnt = 1;
      else if (m == 2)
        cnt = 2;
      else if (m == 3)
        cnt = 3;
      else if (m < 7)
        cnt = 4;
      else {
        cnt = 4 + m - 6;
      }

    }

    System.out.println(cnt);

  }

}
