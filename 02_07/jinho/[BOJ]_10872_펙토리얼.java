import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long result = 1; // 변수 초기화

        // i = 2 부터 : 0! 1!은 1로 정의, 예외처리 피하기
        for (int i = 2; i <= N; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
