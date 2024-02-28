import java.io.*;
import java.util.*;

public class Main {
  static boolean fun(int n) {
    if (n == 1)
      return false;
    for (int i = 2; i <= (int) Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(bf.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int tot = 0;

    for (int i = a; i <= b; i++) {
      if (fun(i))
        System.out.println(i);
    }

  }

}