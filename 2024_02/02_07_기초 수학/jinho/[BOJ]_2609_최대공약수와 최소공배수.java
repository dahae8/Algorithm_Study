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

        // 두 개의 자연수
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        // 최대공약수
        int gcd = gcdNum(num1, num2);
        // 최소공배수
        int lcm = lcmNum(num1, num2);
        System.out.println(gcd);
        System.out.println(lcm);


    }

    // 최대공약수 구하기
    static int gcdNum(int num1, int num2) {
        while (num2 != 0) {
            int swap = num2;
            num2 = num1 % num2;
            num1 = swap;
        }
        return num1;
    }

    // 최소공배수 구하기
    static int lcmNum(int num1, int num2) {
        return (num1 * num2) / gcdNum(num1, num2);
    }
}

