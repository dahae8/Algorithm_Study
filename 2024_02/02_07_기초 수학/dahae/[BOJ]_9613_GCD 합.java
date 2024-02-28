import java.io.*;
import java.util.*;

public class Main {

  static int GCD(int a, int b) {
    if (b == 0) {
      return a;
    }
    return GCD(b, a % b);
  }

  public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc;
        tc = Integer.parseInt(bf.readLine());
        for(int t=0;t<tc;t++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());

            Integer[] arr = new Integer[n];
a
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, Collections.reverseOrder());

            long a=0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    a+=GCD(arr[i],arr[j]);
                }
            }
            sb.append(a).append("\n");

        }
        System.out.print(sb);

    }
}