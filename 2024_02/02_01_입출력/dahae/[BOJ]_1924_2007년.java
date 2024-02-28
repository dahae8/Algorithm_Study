import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int mrr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    String srr[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

    StringTokenizer st = new StringTokenizer(bf.readLine());
    int m = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());

    int t = 0;
    for (int i = 0; i < m - 1; i++) {
      t += mrr[i];
    }
    t += n;

    System.out.println(srr[t % 7]);
  }
}