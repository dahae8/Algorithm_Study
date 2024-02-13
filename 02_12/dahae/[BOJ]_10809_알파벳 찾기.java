import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] crr = br.readLine().toCharArray();
        int[] arr = new int[265];
        Arrays.fill(arr,-1);
        for(int i =0 ; i<crr.length;i++){
            if(arr[crr[i]]==-1){
                arr[crr[i]]=i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i ='a';i<='z';i++){
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }
}