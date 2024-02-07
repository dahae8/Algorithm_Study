import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int f = Integer.parseInt(bf.readLine());

    int tot2 = 0;
    int tot5 = 0;
    for (int i = 2; i <= f; i++) {
      int i2 = i;
      while (true) {
        if (i2 % 2 == 0) {
          tot2++;
          i2 /= 2;
        } else
          break;
      }
      int i5 = i;
      while (true) {
        if (i2 % 5 == 0) {
          tot5++;
          i2 /= 5;
        } else
          break;
      }
    }

    System.out.print(Math.min(tot2, tot5));

  }
}