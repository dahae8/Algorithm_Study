import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 수열
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        // 수가 소수인지 확인하고 개수 세기
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (isPrime(num)) {
                count++;
            }
        }
        System.out.println(count);
    }

    // 소수 판별하기
    static boolean isPrime(int num) {
        if (num < 2) {
            return false;  // 0과 1은 소수가 아님
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;  // 2부터 해당, 숫자의 제곱근까지 나누어 떨어지면 소수가 아님
            }
        }
        return true;  // 나눠떨어지는 수가 없으면 소수
    }
}
