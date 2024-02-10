import java.io.*;
import java.util.*;

class XY {
  int x;
  int y;

  public XY(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    XY xyrr[] = new XY[tc];
    for (int i = 0; i < tc; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      XY xy = new XY(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
      xyrr[i] = xy;
    }
    List<XY> xyList = Arrays.asList(xyrr);
    Collections.sort(xyList, (a, b) -> {
      if (a.y != b.y)
        return a.y - b.y;
      else
        return a.x - b.x;
    });
    StringBuilder sb = new StringBuilder();
    for (XY xy : xyrr) {
      sb.append(xy.x).append(" ").append(xy.y).append("\n");
    }
    System.out.print(sb);

  }
}