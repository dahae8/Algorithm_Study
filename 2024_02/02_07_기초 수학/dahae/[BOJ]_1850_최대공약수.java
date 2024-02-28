import java.io.*;
import java.util.*;

public class Main {
  public static long GCD(long a, long b) {
    if (b == 0) {
      System.out.print("1".repeat((int) a));
      return a;
    }
    return GCD(b, a % b);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(bf.readLine());
    long a, b;

    a = Long.parseLong(st.nextToken());
    b = Long.parseLong(st.nextToken());

    long t;
    if (a > b)
      GCD(a, b);
    else
      GCD(b, a);

  }
}