import java.io.*;
import java.util.*;

public class Main{
    static int n;
    static int k;

    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int time[] = new int[100001];
        Queue<Integer> qu = new LinkedList<>();
        qu.offer(n);

        while(!qu.isEmpty()){
            int cur = qu.poll();
            if(cur == k){
                System.out.println(time[cur]);
                break;
            }

            for (int i : new int[]{cur - 1, cur + 1, cur * 2}) {
                if (i >= 0 && i <= 100000 && time[i] == 0) {
                    time[i] = time[cur] + 1;
                    qu.offer(i);
                }
            }

        }

    }
}