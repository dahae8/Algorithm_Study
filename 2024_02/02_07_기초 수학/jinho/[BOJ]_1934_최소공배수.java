import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader : System.in 에서 데이터 읽어오기 위한 객체 생성 / 문자열을 읽음
        // new InputStreamReader : 바이트 스트림을 문자 스트림으로 변환
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] lcmNums = new int[T];
        for(int i = 0; i < T; i++ ){

            StringTokenizer st = new StringTokenizer(br.readLine());

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            int lcm = lcmNum(num1, num2);
            lcmNums[i] = lcm;
        }
        for(int lcmNum : lcmNums){
            System.out.println(lcmNum);

        }

    }
    // 최대공약수 구하기
    static int gcdNum(int num1, int num2) {
        while (num2 != 0) {
            int swap = num2;
            // num1이 num2보다 작으면 자리바꿈
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

