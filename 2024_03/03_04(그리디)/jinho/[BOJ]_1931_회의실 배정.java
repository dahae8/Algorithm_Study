import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 회의의 수

        int[][] meetings = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            meetings[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
            meetings[i][1] = Integer.parseInt(st.nextToken()); // 끝나는 시간
        }
        // ★ 시작시간과 종료시간이 같을 경우!
        // o : 매개변수, 2차원 배열의 각 행을 나타냄, o[1] 그 행의 두번째 요소
        // 종료시간을 기준으로 오름차순, 같은경우 -> 시작시간을 기준으로
        Arrays.sort(meetings, Comparator.<int[], Integer>comparing(o -> o[1]).thenComparingInt(o -> o[0]));

        int max = 0;
        int nextTime = 0;

        for (int i = 0; i < N; i++) {
            if (meetings[i][0] >= nextTime) {
                max++;
                nextTime = meetings[i][1];
            }
        }
        System.out.println(max);
    }
}
