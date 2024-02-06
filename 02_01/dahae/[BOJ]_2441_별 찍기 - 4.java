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
      for (int j = 0; j <= t - i; j++) {
        sb.append("*");
      }

      sb.append("\n");
    }
    System.out.println(sb);
  }
}