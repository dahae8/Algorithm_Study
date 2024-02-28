import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {
  String name;
  int s1;
  int s2;
  int s3;

  public Student(String name, int s1, int s2, int s3) {
    this.name = name;
    this.s1 = s1;
    this.s2 = s2;
    this.s3 = s3;
  }

  public Student(StringTokenizer st) {
    this.name = st.nextToken();
    this.s1 = Integer.parseInt(st.nextToken());
    this.s2 = Integer.parseInt(st.nextToken());
    this.s3 = Integer.parseInt(st.nextToken());
  }

  @Override
  public int compareTo(Student o) {
    if (this.s1 != o.s1)
      return Integer.compare(o.s1, this.s1);
    else if (this.s2 != o.s2)
      return Integer.compare(this.s2, o.s2);
    else if (this.s3 != o.s3)
      return Integer.compare(o.s3, this.s3);
    else
      return this.name.compareTo(o.name);
  }

}

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int tc = Integer.parseInt(br.readLine());
    List<Student> sl = new ArrayList<Student>();
    for (int i = 0; i < tc; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      sl.add(new Student(st));
    }

    Collections.sort(sl);

    StringBuilder sb = new StringBuilder();
    for (Student s : sl) {
      sb.append(s.name).append("\n");
    }
    System.out.print(sb);
  }
}