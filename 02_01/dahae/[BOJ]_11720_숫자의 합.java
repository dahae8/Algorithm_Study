import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine());
    char[] s = bf.readLine().toCharArray();
    int r = 0;
    for (int i = 0; i < t; i++) {
      r += s[i] - '0';
    }

    System.out.println(r);
  }
}