import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        // 점화식 D[N] = D[N-1] + D[N-2]
        int[] D = new int[1001];
        D[1] = 1;
        D[2] = 2;

        // N 크기 직사각형 채우는 방법의 수
        for (int i = 3; i <= N; i++) {
            D[i] = D[i - 1] + D[i - 2];
            D[i] %= 10007;
        }
        System.out.println(D[N]);

    }
}