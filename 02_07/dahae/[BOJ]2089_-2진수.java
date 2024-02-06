import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int a = Integer.parseInt(bf.readLine());

    if (a == 0) {

      System.out.print(0);
      return;
    }
    int r;
    while (a != 0) {
      r = a % (-2);
      a = a / (-2);
      if (r < 0) {
        a++;
        r = 1;
      }
      sb.append(r);
    }
    System.out.print(sb.reverse());
  }
}