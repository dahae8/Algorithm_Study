import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int e = Integer.parseInt(st.nextToken());
    int s = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int el = 15;
    int sl = 28;
    int ml = 19;

    int ex = 0;
    int sx = 0;
    int mx = 0;

    int r = s;

    while (true) {
      if ((r - e) % el != 0) {
        r += sl;
        continue;
      }
      if ((r - s) % sl != 0) {
        r += sl;
        continue;
      }
      if ((r - m) % ml != 0) {
        r += sl;
        continue;
      }
      break;
    }
    System.out.println(r);
  }

}
