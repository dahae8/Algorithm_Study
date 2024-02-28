import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int f = Integer.parseInt(bf.readLine());
    if (f == 0) {
      System.out.print(1);
      return;
    }
    int tot = 1;
    for (int i = 2; i <= f; i++) {
      tot *= i;
    }
    System.out.print(tot);

  }
}