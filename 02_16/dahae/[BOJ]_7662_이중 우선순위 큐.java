import java.io.*;
import java.util.*;

public class Main {
  static class Fun {
    List<Integer> arr = new ArrayList<>();
    int f;
    int b;

    public Fun() {
      this.f = 0;
      this.b = -1;
    }

    public void I(int i) {
      this.arr.add(i);
    }

    public void Dm() {
      if (this.arr.size() == 0)
        return;
      Collections.sort(this.arr);
      this.arr.remove(this.arr.get(0));
    }

    public void Df() {
      if (this.arr.size() == 0)
        return;
      Collections.sort(this.arr);
      this.arr.remove(this.arr.get(this.arr.size() - 1));
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int tc = Integer.parseInt(br.readLine());
    List<Integer> list = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    for (int testcase = 0; testcase < tc; testcase++) {
      int k = Integer.parseInt(br.readLine());
      Fun f = new Fun();

      for (int i = 0; i < k; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int x = Integer.parseInt(st.nextToken());

        if (s.equals("I")) {
          f.I(x);
        } else if (x < 0) {
          f.Dm();
        } else {
          f.Df();
        }
      }

      if (f.arr.size() != 0) {
        Collections.sort(f.arr);
        sb.append(f.arr.get(f.arr.size() - 1)).append(" ").append(f.arr.get(0));
      } else
        sb.append("EMPTY");
      sb.append("\n");

    }

    System.out.println(sb);

  }

}
