import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      String s = br.readLine();
      Stack<Character> stack = new Stack<>();

      for (char c : s.toCharArray()) {
        if (c == '(') {
          stack.push(c);
        } else if (stack.empty()) {
          stack.push(c);
          break;
        } else {
          stack.pop();
        }
      }
      if (stack.empty()) {
        sb.append("YES").append("\n");
      } else {
        sb.append("NO").append("\n");
      }

    }
    System.out.println(sb);

  }
}
