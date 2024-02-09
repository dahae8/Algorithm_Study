import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int tc = Integer.parseInt(br.readLine());

    int arr[] = new int[tc];

    for (int i = 0; i < tc; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(arr);

    StringBuilder sb = new StringBuilder();
    for (int i : arr) {
      sb.append(i).append("\n");
    }

    System.out.println(sb);
  }

}