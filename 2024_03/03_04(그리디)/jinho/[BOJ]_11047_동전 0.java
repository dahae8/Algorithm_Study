import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 동전종류
        int K = Integer.parseInt(st.nextToken()); // 합

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0; // 동전개수
        for (int i = N - 1; i >= 0; i--) {
            if (K / arr[i] != 0) {
                cnt = cnt + (K / arr[i]);
                K = K % arr[i];
            }
        }
        System.out.println(cnt);

    }
}