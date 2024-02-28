import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        // M부터 N까지 숫자 저장
        List<Integer> numbers = new ArrayList<>();
        for (int i = M; i <= N; i++) {
            numbers.add(i);
        }

        // Main 클래스의 NumEng 메서드의 반환값을 기반으로 비교
        Collections.sort(numbers, Comparator.comparing(Main::NumEng));

        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        for (int num: numbers) {
            sb.append(num).append(" ");
            cnt++;

            if (cnt == 10) {
                cnt = 0;
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }

    static String NumEng(int num) {

        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        if (num < 10) {
            return arr[num];

        } else {
            int a = num / 10; // 십의자리 정수
            int b = num % 10; // 일의자리 정수
            return arr[a] + " " + arr[b];
        }
    }
}