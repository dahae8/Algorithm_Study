import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int f = Integer.parseInt(bf.readLine());

    int tot = 0;
    for (int i = 2; i <= f; i++) {
      while (f % i == 0) {
        System.out.println(i);
        f = f / i;
      }
    }

  }

}