import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 100; i++) {
      String s = br.readLine();
      if (s == null)
        break;
      char crr[] = s.toCharArray();
      int a = 0;
      int b = 0;
      int c = 0;
      int d = 0;
      for (char ch : crr) {
        if (ch == ' ')
          d++;
        else if (ch >= 'a' & ch <= 'z')
          a++;
        else if (ch >= 'A' & ch <= 'Z')
          b++;
        else
          c++;
      }
      sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append("\n");
    }
    System.out.println(sb);

  }
}