import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();

        Integer arr[] = new Integer[s.length()];
        int n=0;
        int f=0;
        for(int i =0;i<s.length();i++){
            arr[i] = Integer.parseInt(s.substring(i,i+1));
            n+=arr[i];
            if(arr[i]==0)f=1;
        }
        if(n%3!=0||f!=1){
            System.out.println(-1);
            return;
        }

        Arrays.sort(arr,Collections.reverseOrder());
        for(int i :arr){
            System.out.print(i);
        }


    }

}
