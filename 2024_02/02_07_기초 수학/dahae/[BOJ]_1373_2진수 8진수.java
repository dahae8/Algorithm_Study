import java.io.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    char arr[] = bf.readLine().toCharArray();

    int brr[] = { 1, 2, 4 };
    int l = arr.length;

    int s = l % 3;
    int idx = 0;
    for (int i = 0; i <= l / 3; i++) {
      int f = 0;
      for (int j = 0; j < 3; j++) {
        int a = l - (3 * i + j) - 1;
        if (a < 0)
          break;
        if (arr[a] == '1')
          f += brr[j];
      }
      if (i == l / 3 & f == 0 & sb.length() != 0) {
        break;
      }
      sb.append(f);
    }

    System.out.println(sb.reverse());

  }
}