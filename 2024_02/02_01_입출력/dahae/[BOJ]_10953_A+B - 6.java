import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(bf.readLine());
        for(int i=0;i<t;i++){
            String s = bf.readLine();
            int a = Integer.parseInt(s.split(",")[0]);
            int b = Integer.parseInt(s.split(",")[1]);
            sb.append(a+b).append("\n");
        }
        System.out.println(sb);

    }
}