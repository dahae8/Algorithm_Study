import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 소인수분해
        factorization(N);
    }

    // 소인수분해 구하기
    static void factorization(int num) {
        // i가 2부터 num까지 반복
        // i = 2 : 가장 작은 소수인 2부터 시작!
        for (int i = 2; i <= num; i++) {
            // num을 i로 나눌 수 있으면 반복
            while (num % i == 0) {
                // i를 소인수로 출력
                System.out.println(i);
                // num을 i로 나누어서 갱신
                num /= i;
            }
        }
    }
}