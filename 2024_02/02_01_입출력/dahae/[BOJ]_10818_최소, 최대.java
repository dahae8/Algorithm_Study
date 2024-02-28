import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(bf.readLine());
    String srr[] = bf.readLine().split(" ");

    int mx = Integer.parseInt(srr[0]);
    int nm = Integer.parseInt(srr[0]);

    for (int i = 1; i < srr.length; i++) {
      int a = Integer.parseInt(srr[i]);
      if (mx < a) {
        mx = a;
      }
      if (nm > a) {
        nm = a;
      }
    }

    System.out.println(nm + " " + mx);
  }
}