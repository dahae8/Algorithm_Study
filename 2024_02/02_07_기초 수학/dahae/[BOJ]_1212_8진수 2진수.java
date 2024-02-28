import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char arr[] = bf.readLine().toCharArray();

        int l = arr.length;

        int s = l%3;
        int idx =0;
        for ( int i =0;i<l;i++){
            StringBuilder sb2 = new StringBuilder();
            int k = arr[i] - 48;
            int x = k/2; //몫
            int y = k%2; //나머지
            while(true){
                sb2.append(y);
                if(x==0)break;
                y = x%2;
                x = x/2;
            }
            if(i==0){
                sb.append(sb2.reverse());
            }else {
                sb.append("0".repeat(3 - sb2.length())).append(sb2.reverse());
            }
        }

        System.out.println(sb);


    }
}import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char arr[] = bf.readLine().toCharArray();

        int l = arr.length;

        int s = l%3;
        int idx =0;
        for ( int i =0;i<l;i++){
            StringBuilder sb2 = new StringBuilder();
            int k = arr[i] - 48;
            int x = k/2; //몫
            int y = k%2; //나머지
            while(true){
                sb2.append(y);
                if(x==0)break;
                y = x%2;
                x = x/2;
            }
            if(i==0){
                sb.append(sb2.reverse());
            }else {
                sb.append("0".repeat(3 - sb2.length())).append(sb2.reverse());
            }
        }

        System.out.println(sb);


    }
}