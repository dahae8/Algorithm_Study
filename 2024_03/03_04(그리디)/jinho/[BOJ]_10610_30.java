import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] N = br.readLine().toCharArray();

        // 30의 배수를 만드는 조건!!!
        // 1. 모든 자리 숫자의 숫자의 합이 3의 배수여야 한다.
        // 2. 0이 적어도 하나는 있어야 한다. ( 30의 배수 중 가장 작은수가 30이므로 0이 없으면 만들 수 없음 )
        int sum = 0;
        boolean hasZero = false;

        for (char c : N) {
            if (c == '0') {
                hasZero = true;
            }
            // Character.getNumericValue(c) : 주어진 문자의 숫자 값을 반환하는 메소드
            // 0-9사이의 숫자면 해당 숫자 값 반환 ,아니면 -1반환 즉, 문자열의 각 문자를 숫자로 반환
            sum += Character.getNumericValue(c);
        }

        if (sum % 3 == 0 && hasZero) {
            Arrays.sort(N);

            // 출력
            for (int i = N.length - 1; i >= 0; i--) {
                System.out.print(N[i]);
            }
        } else {
            System.out.println(-1);
        }
    }
}
