import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 포켓몬의 개수 : N | 문제 개수 : M
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> PoKemonName = new HashMap<>(); // 이름을 키로
        Map<Integer, String> PoKemonNum = new HashMap<>(); // 번호를 키로

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            PoKemonName.put(name, i);
            PoKemonNum.put(i, name);
        }

        for (int j = 0; j < M; j++) {
            String input = br.readLine();
            try {
                // 입력이 정수인 경우
                int key = Integer.parseInt(input);
                System.out.println(PoKemonNum.get(key));

                // 정수가 아닌 경우 에러발생
            } catch (NumberFormatException e) {
                System.out.println(PoKemonName.get(input));
            }
        }
    }
}
