import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(bf.readLine());

    int arr[] = new int[t];
    for (int i = 0; i < t; i++) {
      arr[i] = Integer.parseInt(bf.readLine());
    }

    Arrays.sort(arr);

    for (int i : arr) {
      sb.append(i).append("\n");
    }
    System.out.println(sb);
  }
}