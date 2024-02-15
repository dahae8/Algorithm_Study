import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 집합 S 초기화
        Set<String> S = new HashSet<>();
        for (int i = 0; i < N; i++) {
            S.add(br.readLine());
        }

        // 입력으로 주어지는 문자열 중에서 집합 S에 포함되어 있는 것의 개수 구하기
        int count = 0;
        for (int i = 0; i < M; i++) {
            String str = br.readLine();

            // contains : 해당 컬렉션에 특정 요소가 포함되어 있는지 여부를 확인
            if (S.contains(str)) {
                count++;
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}
