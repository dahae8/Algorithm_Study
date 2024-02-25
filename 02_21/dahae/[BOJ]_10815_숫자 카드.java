import java.io.*;
import java.util.*;

public class Main{


    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0;i<n;i++){
            hs.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<m;i++){
            int c = Integer.parseInt(st.nextToken());
            if(hs.contains(c))sb.append(1);
            else sb.append(0);
            sb.append(" ");
        }

        System.out.println(sb);

    }
}