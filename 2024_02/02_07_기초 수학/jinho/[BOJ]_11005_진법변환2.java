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

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while (N != 0) {
            // 나머지가 10 이상일 때, 알파벳으로 바꾸기
            // A : 65 Z : 90
            if (N % B >= 10) {
                // char : 정수를 문자로, ascii 문자로 변환
                sb.append((char) ((N % B) + 55)); // 55 : 'A' - 10
            } else { // 나머지가 10 미만인 경우 그대로
                sb.append(N % B);
            }
            // 몫을 새로운 N으로
            N = N / B;

        }
        // 결과 뒤집기
        System.out.println(sb.reverse().toString());
    }
}
