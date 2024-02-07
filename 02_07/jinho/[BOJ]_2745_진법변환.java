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

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int sum = 0;
        int n = 1;

        for (int i = N.length() - 1; i >= 0; i--) {
            if (N.charAt(i) >= 'A' && N.charAt(i) <= 'Z') {
                sum += (N.charAt(i) - 'A' + 10) * n;

            } else {
                sum += (N.charAt(i) - '0') * n;
            }
            n *= B;
        }
        System.out.println(sum);
    }
}
/*
        // 10진법으로
        long result = convert(B, N);

        System.out.println(result);

    }

    // B > 10진법
    static long convert(long B, String N) {
        long result = 0;

        for (int i = N.length() - 1; i >= 0; i--) {
            char digit = N.charAt(i);

            int value;

            // Character.isDigit(문자) : 주어진 문자가 10진수 숫자 인지 반환
            // 숫자일 때, 문자를 정수로 바꿈
            if (Character.isDigit(digit)) {
                value = digit - '0';
            } else {
                // 알파벳일 때, 10부터 시작하는 정수로 바꿈
                value = Character.toUpperCase(digit) - 'A' + 10;
            }
            result = result * B + value;
        }
        return result;
    }
}

 */