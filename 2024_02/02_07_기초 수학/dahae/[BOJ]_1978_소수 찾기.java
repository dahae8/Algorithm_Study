import java.io.*;
import java.util.*;

public class Main {
    static int fun(int n){
        if (n==1)return 0;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());


        int tot=0;

        for( int i =0;i<t;i++){
            tot += fun(Integer.parseInt(st.nextToken()));
        }

        System.out.print(tot);
    }



}