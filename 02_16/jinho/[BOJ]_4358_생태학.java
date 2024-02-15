import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 나무 종류 | 빈도
        HashMap<String, Integer> map = new HashMap<>();

        // 나무의 총 개수
        int count = 0;

        while (true) {
            String tree = br.readLine();
            // 입력이 null, 비어있으면 종료
            if (tree == null || tree.length() == 0) {
                break;
            }

            // HashMap에 나무의 종류와 빈도를 저장
            // getOrDefault : map의 특정 키에 대한 값 반환/ 존재하지 않으면 0
            map.put(tree, map.getOrDefault(tree, 0) + 1);
            // 총 나무의 개수를 증가
            count++;
        }

        Object[] arr = map.keySet().toArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for (Object i : arr) {
            String key = i.toString();
            // 나무의 빈도를 총 나무의 개수로 나누어 백분율을 계산
            // avg : 빈도
            double avg = map.get(key);
            avg = avg / count * 100;
            // 소수점 4자리까지 반올림
            sb.append(i).append(" ").append(String.format("%.4f", avg)).append("\n");
        }

        // 결과를 화면에 출력합니다.
        System.out.println(sb);
    }
}
