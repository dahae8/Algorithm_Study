import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // nCm -> 0의 개수
        int zeros = countZeros(n, m);

        System.out.println(zeros);
    }

    // 조합 nCm의 0의 개수 계산
    // 0의 개수는 2와 5의 겹치는 승수의 값과 같다. > 2와 5의 승수 구하기
    static int countZeros(int n, int m) {
        // n!과 m!, (n-m)!의 2의 지수와 5의 지수를 각각 계산
        int twos = countFactors(n, 2) - countFactors(m, 2) - countFactors(n - m, 2);
        int fives = countFactors(n, 5) - countFactors(m, 5) - countFactors(n - m, 5);

        // 2와 5 중에서 더 작은 지수가 0의 개수를 결정
        return Math.min(twos, fives);
    }

    // 소인수분해에서 특정 소수의 지수를 계산
    static int countFactors(int number, int factor) {
        int count = 0;
        while (number > 0) {
            number /= factor;
            count += number;
        }
        return count;
    }
}
