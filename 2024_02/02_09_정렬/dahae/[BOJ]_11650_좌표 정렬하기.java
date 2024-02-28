import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    int tc = Integer.parseInt(br.readLine());

    XY xyrr[] = new XY[tc];

    for (int i = 0; i < tc; i++) {
      st = new StringTokenizer(br.readLine());
      XY xy = new XY(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
      xyrr[i] = xy;
    }

    List<XY> xyList = Arrays.asList(xyrr);

    Collections.sort(xyList);

    for (XY xy : xyList) {
      sb.append(xy.x).append(" ").append(xy.y).append("\n");
    }
    System.out.print(sb);

  }
}

class XY implements Comparable<XY> {
  int x;
  int y;

  public XY(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public int compareTo(XY o) {
    if (this.x != o.x) {
      return Integer.compare(this.x, o.x);
    } else {
      return Integer.compare(this.y, o.y);
    }
  }
}
