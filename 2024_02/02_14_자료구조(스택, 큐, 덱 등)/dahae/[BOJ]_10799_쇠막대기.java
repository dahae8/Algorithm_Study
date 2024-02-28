import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char c[] = br.readLine().toCharArray();
    int b = 0;
    int t = 0;

    for (int i = 0; i < c.length; i++) {
      if (c[i] == '(') {
        if (c[i + 1] == ')') {
          t += b;
        } else {
          b++;
          t++;
        }
      } else {
        if (c[i - 1] != '(') {
          b--;
        }
      }
    }

    System.out.println(t);

  }
}
