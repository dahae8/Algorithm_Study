import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());
    StringBuilder sb = new StringBuilder();

    int a, b, c;

    a = Integer.parseInt(st.nextToken());
    b = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());

    sb.append((a + b) % c).append("\n");
    sb.append(((a % c) + (b % c)) % c).append("\n");
    sb.append((a * b) % c).append("\n");
    sb.append(((a % c) * (b % c)) % c);
    System.out.println(sb);

  }
}
