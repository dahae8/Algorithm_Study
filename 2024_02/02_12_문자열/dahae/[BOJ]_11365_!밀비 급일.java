import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        while(true){
            StringBuffer s = new StringBuffer(br.readLine());
            if(s.toString().equals("END"))break;
            sb.append(s.reverse().toString()).append("\n");
        }
        System.out.println(sb);
    }
}