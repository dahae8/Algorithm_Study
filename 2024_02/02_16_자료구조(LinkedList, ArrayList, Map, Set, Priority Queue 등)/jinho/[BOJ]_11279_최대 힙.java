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


        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            input[i] = Integer.parseInt(st.nextToken());
        }

        // PriorityQueue : 우선순위 큐 ( 작은순서대로 우선순위 부여, 작은순서가 높은 운선순위 )
        // Comparator : 두 객체 간의 순서 비교, a가 b보다 작으면 음수, 같으면 0, 크면 양수 반환
        // 우선순위 역순으로 배열 : a가 b보다 작으면 양수, 같으면0, 크면 음수
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        for (int i : input) {
            if (i == 0) {
                // 배열에서 가장 큰 값 출력, 그 값을 배열에서 제거
                if (!maxHeap.isEmpty()) {
                    int max = maxHeap.poll();
                    System.out.println(max);
                } else {
                    // 배열이 비어있는 경우 : 0
                    System.out.println(0);
                }
            } else {
                // 배열에 자연수 넣기
                maxHeap.offer(i);
            }
        }
    }
}
