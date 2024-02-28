import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            int M = Integer.parseInt(br.readLine());
            int cnt = 0;

            System.out.println((M + 1) / 2);

            for (int i = 0; i < M; i++) {
                if (i % 10 == 0) {
                    st = new StringTokenizer(br.readLine(), " ");
                }

                int n = Integer.parseInt(st.nextToken());

                if (maxHeap.size() == minHeap.size()) {
                    maxHeap.offer(n);
                } else {
                    minHeap.offer(n);
                }

                if (!minHeap.isEmpty()) {
                    if (maxHeap.peek() > minHeap.peek()) {
                        int t1 = maxHeap.poll();
                        int t2 = minHeap.poll();

                        maxHeap.offer(t2);
                        minHeap.offer(t1);
                    }
                }

                if (i % 2 == 0) {
                    if (cnt == 9 || i == M - 1) {
                        System.out.println(maxHeap.peek());
                        cnt = 0;
                    } else {
                        System.out.print(maxHeap.peek() + " ");
                    }
                    cnt++;
                }
            }
        }
    }
}
