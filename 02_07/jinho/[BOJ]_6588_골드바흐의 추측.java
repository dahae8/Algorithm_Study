import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 소수 여부 저장, 0부터 1000000 까지
        // 소수 일 경우 true / 소수 아닐 경우 false
        boolean[] flag = new boolean[1000001];

        // 배열 true 초기화
        Arrays.fill(flag, true);

        // 에라토스테네스의 체 알고리즘 > 소수 판별에 유용하다.
        // 모든 수를 소수로 가정하고 시작
        for (int i = 3; i < 1000001; i++) {
            if (flag[i]) {
                // 현재 수가 소수일 때, 그 수의 배수들은 모두 소수가 아님!
                for (int j = i + i; j < 1000001; j = j + i) {
                    flag[j] = false;
                }
            }
        }

        while (true) {
            // 짝수 n
            int n = Integer.parseInt(br.readLine());

            if (n == 0)
                break;

            int count = 0;

            // 골드바흐
            for (int i = 3; i < 1000001; i++) {
                if (flag[i] && flag[n - i]) {
                    // n = a + b 형태
                    System.out.println(n + " = " + i + " + " + (n - i));
                    count = 1;
                    break;
                }
            }
            // 두 홀수 소수의 합으로 n을 나타낼 수 없는 경우 "Goldbach's conjecture is wrong."
            if (count == 0)
                System.out.println("Goldbach's conjecture is wrong.");
        }
    }
}