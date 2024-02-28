import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String s = bf.readLine();
    while (s != null) {
      sb.append(s).append("\n");
      s = bf.readLine();
    }

    System.out.println(sb);
  }
}