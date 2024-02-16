import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] input = new int[N];


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            input[i] = Integer.parseInt(st.nextToken());
        }

        // PriorityQueue : 우선순위 큐 ( 작은순서대로 우선순위 부여, 작은순서가 높은 운선순위 )
        // Comparator : 두 객체 간의 순서 비교, a가 b보다 작으면 음수, 같으면 0, 크면 양수 반환
        // a와 b의 절댓값을 계산
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);

            if (absA == absB) {
                return Integer.compare(a, b); // 절댓값이 같으면 원래 값 비교 -> 작은거 먼저
            }
            return Integer.compare(absA, absB); // 절댓값이 다르면 절댓값 비교 -> 마이너스 먼저
        });

        for (int i : input) {
            if (i == 0) {
                // 배열에서 가장 작은 값 출력, 그 값을 배열에서 제거
                if (!minHeap.isEmpty()) {
                    int min = minHeap.poll();
                    System.out.println(min);
                } else {
                    // 배열이 비어있는 경우 : 0
                    System.out.println(0);
                }
            } else {
                // 배열에 자연수 넣기
                minHeap.offer(i);
            }
        }
    }
}
