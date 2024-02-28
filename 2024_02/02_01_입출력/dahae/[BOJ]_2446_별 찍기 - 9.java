import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine());
    StringBuilder sb = new StringBuilder();

    for (int i = 1; i <= t; i++) {
      for (int j = 1; j < i; j++) {
        sb.append(" ");
      }
      for (int j = 1; j <= (t - i) * 2 + 1; j++) {
        sb.append("*");
      }
      sb.append("\n");
    }
    for (int k = 1; k < t; k++) {
      int i = t - k;
      for (int j = 1; j < i; j++) {
        sb.append(" ");
      }
      for (int j = 1; j <= (t - i) * 2 + 1; j++) {
        sb.append("*");
      }

      if (t == i)
        break;
      sb.append("\n");
    }

    System.out.print(sb);
  }
}