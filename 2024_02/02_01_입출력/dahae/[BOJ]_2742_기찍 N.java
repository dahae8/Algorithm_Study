import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(bf.readLine());
    while (t > 0) {
      sb.append(t).append("\n");
      t--;
    }

    System.out.println(sb);
  }
}