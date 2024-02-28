import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());
    char arr[] = st.nextToken().toCharArray();
    int b = Integer.parseInt(st.nextToken());
    int r = 0;
    for (int i = arr.length - 1; i >= 0; i--) {

      if (arr[arr.length - 1 - i] >= 65) {
        r += Math.pow(b, i) * Integer.parseInt(String.valueOf(arr[arr.length - 1 - i] - 55));
      } else {
        r += Math.pow(b, i) * Integer.parseInt(String.valueOf(arr[arr.length - 1 - i]));
      }
    }

    System.out.println(r);

  }
}