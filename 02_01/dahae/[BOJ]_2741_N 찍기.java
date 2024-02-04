import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(bf.readLine());
    int a = 1;
    while (a <= t) {
      sb.append(a).append("\n");
      a++;
    }

    System.out.println(sb);
  }
}