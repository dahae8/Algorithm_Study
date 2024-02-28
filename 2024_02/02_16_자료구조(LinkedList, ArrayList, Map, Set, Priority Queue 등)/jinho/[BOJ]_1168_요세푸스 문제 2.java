import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 인원수
        int K = Integer.parseInt(st.nextToken())-1; // 순서간격

        List<Integer> q = new ArrayList<>();

        for (int i = 1; i <= N; i++) q.add(i);
        int in = K;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 1; i < N; i++) {
            sb.append(q.remove(in));
            sb.append(", ");
            in += K;
            in %= q.size();
        }
        sb.append(q.remove(0)).append(">");
        System.out.println(sb);
    }
}
