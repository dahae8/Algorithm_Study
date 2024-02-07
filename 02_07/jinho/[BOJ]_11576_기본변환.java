import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Long> stack = new Stack<>();

        // 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());

        long tenSum = 0;

        // A진법 > 10진법
        StringTokenizer secondLine = new StringTokenizer(br.readLine());
        for (int i = N - 1; i >= 0; i--) {
            int num = Integer.parseInt(secondLine.nextToken());
            tenSum += num * Math.pow(A, i);
        }

        // 10진법 > B진법
        while (tenSum != 0) {
            // 10진법을 B로 나눈 나머지 스택으로
            stack.push(tenSum % B);
            // 10진법 수를 B로 나눈 몫으로
            tenSum /= B;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
