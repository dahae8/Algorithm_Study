import java.io.*;
import java.util.*;

public class Main {
  static List<String> slist = new ArrayList<>();
  static List<String> caseList = new ArrayList<>();
  static int tc;
  static int isUsed[] = new int[10];
  static int num[] = new int[10];
  static int k = 0;

  static void Fun(int idx, int n) {
    if (idx >= tc) {
      StringBuilder sb = new StringBuilder();
      for (int k : num) {
        if (k == -1)
          break;
        sb.append(k);
      }
      caseList.add(String.valueOf(sb));
      return;
    }
    for (int i = 0; i <= 9; i++) {
      if (isUsed[i] == 1)
        continue;
      if (idx + 1 > 0) {
        String s = slist.get(idx);
        if (s.equals("<")) {
          if (num[idx] > i)
            continue;
        } else {
          if (num[idx] < i)
            continue;
        }
      }
      num[idx + 1] = i;
      isUsed[i] = 1;
      Fun(idx + 1, i);
      isUsed[i] = 0;
      num[idx + 1] = -1;
    }

  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    tc = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < tc; i++) {
      slist.add(st.nextToken());
    }
    for (int i = 0; i < 10; i++) {
      num[i] = -1;
    }

    Fun(-1, 0);

    Collections.sort(caseList, Collections.reverseOrder());
    StringBuilder sb = new StringBuilder();
    sb.append(caseList.get(0)).append("\n").append(caseList.get(caseList.size() - 1));
    System.out.print(sb);

  }

}