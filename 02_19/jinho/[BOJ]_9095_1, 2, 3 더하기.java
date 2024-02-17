+import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int result = Count(N);
            System.out.println(result);
        }
    }

    public static int Count(int N) {
        if (N == 1) {
            return 1;
        } else if (N == 2) {
            return 2; // 1 + 1 | 2
        } else if (N == 3) {
            return 4; // 1 + 1 + 1 | 1 + 2 | 2 + 1 | 3
        }

        return Count(N - 1) + Count(N - 2) + Count(N - 3);
    }
}
