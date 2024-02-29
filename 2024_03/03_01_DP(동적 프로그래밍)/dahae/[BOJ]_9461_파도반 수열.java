import java.io.*;
import java.util.*;

public class Main{
    static long brr[] = {0,1,1, 1, 2, 2, 3, 4, 5, 7, 9};
    static long arr[];

    static long fun(int idx){
        if(arr[idx]!=0){
            return arr[idx];
        }
        if(idx<brr.length){
            arr[idx] = brr[idx];
            return arr[idx];
        }
        arr[idx] = fun(idx-1)+fun(idx-5);
        return arr[idx];
    }

    public static void main(String args[])throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int tc = 0 ;tc<T;tc++){
            int n = Integer.parseInt(br.readLine());
            arr = new long[n+1];
            sb.append(fun(n)+"\n");
        }
        System.out.println(sb);

    }
}
