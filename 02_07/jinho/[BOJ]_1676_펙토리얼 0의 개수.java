import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0 개수
        int zeroCount = 0;
        for (int i = 5; i <= N; i *= 5) {
            // i는 5의 배수, N!에서 10으로 나누어 떨어지는 횟수가 0의 개수
            zeroCount += N / i;
        }

        System.out.println(zeroCount);
    }
}
