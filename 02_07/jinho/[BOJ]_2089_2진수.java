import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        if (N == 0) {
            sb.append(0);
        } else {
            // N이 1일 될 때 까지
            while (N != 1) {
                // 나머지를 구해서 StringBuilder 넣기
                sb.append(Math.abs(N % -2));

                // 다음 자릿수 계산
                // Math.ceil : 주어진 숫자 올림하여 양수로 반환
                N = (int) (Math.ceil((double) N / -2)); // (int) : 형변환
            }
            // 마지막 자리수
            sb.append(N);
        }
        // 뒤집어서 출력
        System.out.println(sb.reverse());
    }
}