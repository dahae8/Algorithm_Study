import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    StringBuilder sb = new StringBuilder();
    String[] srr = new String[s.length()];
    for (int i = 0; i < s.length(); i++) {
      srr[i] = s.substring(i);
    }
    Arrays.sort(srr);
    for (String st : srr) {
      sb.append(st).append("\n");
    }
    System.out.println(sb);

  }
}