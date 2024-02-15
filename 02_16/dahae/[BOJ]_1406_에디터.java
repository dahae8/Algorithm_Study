import java.io.*;
import java.util.*;

public class Main {

  static class Cla {
    Stack<Character> fs;
    Stack<Character> es;

    public Cla(String s) {
      fs = new Stack<>();
      es = new Stack<>();
      for (char c : s.toCharArray()) {
        this.fs.push(c);
      }
    }

    public void L() {

      if (this.fs.size() == 0)
        return;
      this.es.push(this.fs.pop());
    }

    public void D() {
      if (this.es.size() == 0)
        return;
      this.fs.push(this.es.pop());
    }

    public void B() {
      if (this.fs.size() == 0)
        return;
      this.fs.pop();
    }

    public void P(Character c) {
      this.fs.push(c);
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    int p = Integer.parseInt(br.readLine());
    Cla cla = new Cla(s);
    for (int i = 0; i < p; i++) {

      StringTokenizer st = new StringTokenizer(br.readLine());
      String o = st.nextToken();
      if (o.equals("L")) {
        cla.L();
      } else if (o.equals("D")) {
        cla.D();
      } else if (o.equals("B")) {
        cla.B();
      } else if (o.equals("P")) {
        cla.P(st.nextToken().charAt(0));
      }

    }

    while (!cla.fs.isEmpty()) {
      cla.es.push(cla.fs.pop());
    }
    StringBuilder sb = new StringBuilder();
    while (!cla.es.isEmpty()) {
      sb.append(cla.es.pop());
    }
    System.out.println(sb);

  }

}
