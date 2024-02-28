import java.io.*;
import java.util.StringTokenizer;

public class Main {
  static boolean fun(int n) {
    if (n == 1)
      return false;
    for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sbb = new StringBuilder();
    int n = Integer.parseInt(bf.readLine());
    while (n != 0) {
      int l = 0;
      int x, y;
      StringBuilder sb = new StringBuilder();
      for (int i = 3; i <= n / 2; i += 2) {
        if (!fun(i))
          continue;
        int k = n - i;
        if (!fun(k))
          continue;
        l++;

        sb.append(n).append(" = ").append(i).append(" + ").append(k).append("\n");
        break;
      }

      if (l == 0)
        sbb.append("Goldbach's conjecture is wrong.");
      else
        sbb.append(sb);
      n = Integer.parseInt(bf.readLine());
    }
    System.out.print(sbb);

  }
}