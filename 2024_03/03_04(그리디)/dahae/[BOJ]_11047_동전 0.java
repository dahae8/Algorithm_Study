import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        for(int i =n-1;i>=0;i--){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        int cnt=0;
        for(int i =0 ; i<n;i++){
            cnt+=k/arr[i];
            k %=arr[i];
        }
        System.out.println(cnt);

    }

}
