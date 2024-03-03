import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 여학생
        int M = Integer.parseInt(st.nextToken()); // 남학생
        int K = Integer.parseInt(st.nextToken()); // 인턴

        int cnt = 0;

        while (N >= 2 && M >= 1 && N + M >= 3 + K) {
            // 팀 : 여 2 남 1
            N = N - 2;
            M = M - 1;
            cnt++;
        }
        System.out.println(cnt);

    }
}