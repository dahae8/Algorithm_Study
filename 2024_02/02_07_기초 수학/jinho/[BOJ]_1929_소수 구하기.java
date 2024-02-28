import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        // 각 숫자가 소수인지 확인
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    // 소수 판별
    static boolean isPrime(int num) {
        if (num < 2) {
            return false;  // 0과 1은 소수가 아니다.
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;  // 2부터 해당, 숫자의 제곱근까지 나누어 떨어지면 소수가 아님
            }
        }
        return true;  // 나누어 떨어지는 수가 없으면 소수
    }

}
