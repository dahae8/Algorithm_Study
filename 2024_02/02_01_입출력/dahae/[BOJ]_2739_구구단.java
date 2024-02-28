import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(bf.readLine());
    for (int i = 1; i <= 9; i++) {
      sb.append(t).append(" * ").append(i).append(" = ").append(t * i).append("\n");
    }

    System.out.println(sb);
  }
}