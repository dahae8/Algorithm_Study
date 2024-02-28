import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str = bf.readLine();
    int t = str.length() / 10 + 1;
    int s = 0;
    int e = 10;
    for (int i = 0; i < t; i++) {
      if (i == t - 1) {
        sb.append(str.substring(s));
        break;
      }
      sb.append(str.substring(s, e)).append("\n");
      s = e;
      e += 10;
    }

    System.out.println(sb);
  }
}