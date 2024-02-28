import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// int > long 으로 수정
public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader : System.in 에서 데이터 읽어오기 위한 객체 생성 / 문자열을 읽음
        // new InputStreamReader : 바이트 스트림을 문자 스트림으로 변환
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        long[] result = new long[T];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // N값 할당 받음
            int N = Integer.parseInt(st.nextToken());

            int[] numbers = new int[N];
            for (int j = 0; j < N; j++) {
                // 두번째 입력 부분 부터 배열에 저장
                numbers[j] = Integer.parseInt(st.nextToken());
            }
            long gcdSum = gcdNumSum(numbers);
            result[i] = gcdSum;
        }
        for (long in : result) {
            System.out.print(in);
            System.out.println();
        }

    }

    static long gcdNumSum(int[] numbers) {
        long sum = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sum += gcdNum(numbers[i], numbers[j]);
            }
        }
        return sum;
    }

    // 최대공약수 구하기
    static long gcdNum(long num1, long num2) {
        while (num2 != 0) {
            long swap = num2;
            num2 = num1 % num2;
            num1 = swap;
        }
        return num1;
    }


}
