import java.io.*;
import java.util.*;

public class Main {
  static int ToInt(String s) {
    int a = 0;
    char crr[] = s.toCharArray();
    for (char c : crr) {
      if (c <= '9')
        a += c - '0';
    }
    return a;
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int tc = Integer.parseInt(br.readLine());

    List<String> list = new ArrayList<>();

    for (int i = 0; i < tc; i++) {
      list.add(br.readLine());
    }

    Collections.sort(list, (a, b) -> {
      if (a.length() != b.length()) {
        return Integer.compare(a.length(), b.length());
      } else {
        int ai = ToInt(a);
        int bi = ToInt(b);

        if (ai != bi)
          return Integer.compare(ai, bi);
        else
          return a.compareTo(b);
      }

    });
    StringBuilder sb = new StringBuilder();
    for (String s : list) {
      sb.append(s).append("\n");
    }

    System.out.print(sb);

  }

}