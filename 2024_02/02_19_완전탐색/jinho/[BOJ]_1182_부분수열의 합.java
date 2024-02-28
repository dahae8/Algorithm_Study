import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, S, count = 0;
    static int[] arr;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        method(0, 0);

        if (S == 0) { // 합이 0일 떼, 공집합 카운트 제외
            count--;
            System.out.println(count);
        } else {
            System.out.println(count);
        }
    }

    private static void method(int start, int sum) {
        // 배열이 끝에 왔을 때
        if (start == N) {
            // 원하는 합과 현재 합이 같을 때
            if (sum == S) {
                count++;
            }
            return;
        }
        // 현재 원소 더한 경우, 더하지 않은 경우
        method(start + 1, sum + arr[start]);
        method(start + 1, sum);
    }
}
