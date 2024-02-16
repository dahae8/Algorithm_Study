import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st;

        // TreeMap -> 값 | 빈도수
        TreeMap<Integer, Integer> tree = new TreeMap<>();

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            // 연산 횟수
            int K = Integer.parseInt(br.readLine());

            // 각 테스트 케이스마다 tree을 초기화
            tree.clear();

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                char operation = st.nextToken().charAt(0);
                int num = Integer.parseInt(st.nextToken());

                // 연산 수행
                if (operation == 'I') {  // 삽입 연산
                    // 값이 이미 존재할 때 -> 빈도수 증가
                    tree.put(num, tree.getOrDefault(num, 0) + 1);
                } else {  // 삭제 연산
                    // 비어있을 때 -> 무시하고 다음 연산 수행
                    if (tree.isEmpty()) continue;

                    int value, count;

                    // 최댓값 삭제 연산
                    if (num == 1) {
                        value = tree.lastKey();
                    } else {  // 최솟값 삭제 연산
                        value = tree.firstKey();
                    }

                    count = tree.get(value);

                    // 빈도수가 1 -> 삭제
                    tree.remove(value);

                    // 빈도수가 1보다 클 때 -> 추가
                    if (count > 1) tree.put(value, count - 1);
                }
            }
            // 비어있을 때 -> "EMPTY" 출력
            if (tree.isEmpty()) {
                sb.append("EMPTY\n");
            } else {  // 최대 | 최소
                sb.append(tree.lastKey()).append(" ").append(tree.firstKey()).append("\n");
            }
        }

        // 결과 출력
        System.out.println(sb.toString());
    }
}
