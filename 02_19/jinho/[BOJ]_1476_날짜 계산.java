import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // E : 15 | S : 28 | M : 19
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int Year = toYear(E, S, M);
        System.out.println(Year);
    }

    // 함수
    private static int toYear(int E, int S, int M) {
        int year = 1;

        while (true) {
            int curE = (year % 15 == 0) ? 15 : year % 15;
            int curS = (year % 28 == 0) ? 28 : year % 28;
            int curM = (year % 19 == 0) ? 19 : year % 19;

            // 계산된 수가 주어진 값과 일치하면 현재 연도 반환
            if (curE == E && curS == S && curM == M) {
                return year;
            }
            year++;
        }
    }
}
