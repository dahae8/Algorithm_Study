import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int tot = 0;

        while (n >= 2 && m >= 1 && n + m >= 3 + k) {
            n -= 2;
            m -= 1;
            tot++;
        }
        System.out.println(tot);

    }

}