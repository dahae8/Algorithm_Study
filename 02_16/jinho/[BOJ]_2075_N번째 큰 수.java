import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> arr = new ArrayList<>();
        // int[][] table = new int[N][N];

        int i = 0;
        while (i < N) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int j = 0;
            while (j < N) {
                int s = Integer.parseInt(st.nextToken());
                arr.add(s);
                j++; // 열 인덱스 증가
            }
            i++; // 행 인덱스 증가
        }

        // 리스트 내림차순으로 정렬
        Collections.sort(arr, Collections.reverseOrder());

        // 정렬된 리스트에서 가장 작은 값 출력 -> 내림차순
        System.out.println(arr.get(N - 1));
    }
}
