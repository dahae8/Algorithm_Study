import java.io.*;
import java.util.*;

class Cl implements Comparable<Cl> {
  int age;
  String name;

  public Cl(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public int compareTo(Cl o) {
    return Integer.compare(this.age, o.age);
  }

}

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    Cl clrr[] = new Cl[tc];

    for (int i = 0; i < tc; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      Cl cl = new Cl(Integer.parseInt(st.nextToken()), st.nextToken());
      clrr[i] = cl;
    }

    List<Cl> clList = Arrays.asList(clrr);

    Collections.sort(clList);
    StringBuilder sb = new StringBuilder();
    for (Cl cl : clList) {
      sb.append(cl.age).append(" ").append(cl.name).append("\n");
    }
    System.out.print(sb);

  }
}