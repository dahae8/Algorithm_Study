import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    // max : 현재 랜선 중 가장 긴 길이 | min : 이진탐색을 위한 최소 길이
    static long max = 0, min = 1;
    static ArrayList<Long> list = new ArrayList<>(); // 이미 있는 랜선 길이 저장

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken()); // 랜선 이미 있음
        int N = Integer.parseInt(st.nextToken()); //필요한 랜선의 개수

        // 이미 있는 랜선들의 길이를 리스트에 추가하여 최대 길이 업데이트
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            long num = Long.parseLong(st.nextToken());
            list.add(num);
            if (max < num) {
                max = num;
            }
        }


        while (min <= max) {
            long mid = (min + max) / 2;
            long sum = 0;

            for (int i = 0; i < list.size(); i++) {
                // 랜선 자른 길이만큼 더하기
                sum += (list.get(i) / mid);
            }
            if (sum < N) { // 필요한 랜선의 개수보다 작으면 -> 더 작은 길이 탐색
                max = mid - 1;
            } else { // 더 큰 길이 탐색
                min = mid + 1;
            }
        }
        // min이 필요한 길이보다 1 더 큰 상태로 유지
        System.out.println(min - 1);
    }

}