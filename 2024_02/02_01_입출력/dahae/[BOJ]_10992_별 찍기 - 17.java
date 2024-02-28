import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine());
    StringBuilder sb = new StringBuilder();
    int tt = 2 * t - 1;
    for (int i = 1; i < t; i++) {
      for (int j = 1; j <= t - i; j++) {
        sb.append(" ");
      }
      sb.append("*");
      if (i == 1) {
        sb.append("\n");
        continue;
      }
      for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
        sb.append(" ");
      }
      sb.append("*\n");
    }
    for (int j = 1; j <= tt; j++) {
      sb.append("*");
    }

    System.out.print(sb);
  }
}