import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String srr[] = br.readLine().split(":");
    String err[] = br.readLine().split(":");
    int sh = Integer.parseInt(srr[0]);
    int eh = Integer.parseInt(err[0]);

    int sm = Integer.parseInt(srr[1]);
    int em = Integer.parseInt(err[1]);

    int ss = Integer.parseInt(srr[2]);
    int es = Integer.parseInt(err[2]);

    if (sh > eh)
      eh += 24;
    else if (sh == eh) {
      if (sm > em)
        eh += 24;
      else if (sm == em) {
        if (ss >= es)
          eh += 24;
      }
    }

    if (ss > es) {
      es += 60;
      em--;
    }

    if (sm > em) {
      em += 60;
      eh--;
    }

    int h = eh - sh;
    int m = em - sm;
    int s = es - ss;
    StringBuilder sb = new StringBuilder();

    System.out.println(sb.append(ToString(h)).append(":").append(ToString(m)).append(":").append(ToString(s)));

  }

  static String ToString(int x) {
    StringBuilder sb = new StringBuilder();
    if (x < 10)
      return sb.append("0").append(x).toString();
    else
      return sb.append(x).toString();
  }
}
