import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char crr[]  = br.readLine().toCharArray();
        int arr[] = new int[256];
        for(char c:crr){
            arr[c]++;
        }

        StringBuilder sb= new StringBuilder();
        for(int i ='a';i<='z';i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}