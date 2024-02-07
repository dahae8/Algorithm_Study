import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader : System.in 에서 데이터 읽어오기 위한 객체 생성 / 문자열을 읽음
        // new InputStreamReader : 바이트 스트림을 문자 스트림으로 변환
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄에 여러 개의 정수 입력
        // StringTokenizer : 공백으로 구분 된 토큰 받기
        StringTokenizer st = new StringTokenizer(br.readLine());

        long num1 = Long.parseLong(st.nextToken());
        long num2 = Long.parseLong(st.nextToken());

        long gcd = gcdNum(num1, num2);
        StringBuilder gcdLength = new StringBuilder();

        // 결과 값
        for ( int i = 0; i < gcd; i++){
            gcdLength.append('1');
        }
        System.out.println(gcdLength);

    }
    // 최대공약수 구하기
    static long gcdNum(long num1, long num2) {
        while (num2 != 0) {
            long swap = num2;
            // num1이 num2보다 작으면 자리바꿈
            num2 = num1 % num2;
            num1 = swap;
        }
        return num1;
    }
    /*----------------------------------------------------------
    static BigInteger gcdLen(BigInteger num1, BigInteger num2) {
        String lenNum1 = num1.toString();
        String lenNum2 = num2.toString();

        int len1 = lenNum1.length();
        int len2 = lenNum2.length();
        int len = Math.min(len1, len2);

        StringBuilder gcdLength = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (lenNum1.charAt(i) == '1' && lenNum2.charAt(i) == '1') {
                gcdLength.append('1');
            } else {
                break;
            }
        }
        return new BigInteger(gcdLength.toString());
    }
    ----------------------------------------------------------*/
}

