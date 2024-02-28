import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<String> Deque = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("pop_front")) {
                if (Deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    //첫번째 인덱스 삭제 후 출력
                    String firstValue = Deque.remove(0);
                    System.out.println(firstValue);
                }
            }
            if (str.equals("pop_back")) {
                if (Deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    //마지막 인덱스 삭제 후 출력
                    String firstValue = Deque.remove(Deque.size() - 1);
                    System.out.println(firstValue);
                }

            } else if (str.equals("size")) {
                System.out.println(Deque.size());

            } else if (str.equals("empty")) {
                System.out.println(Deque.isEmpty() ? 1 : 0);

                // 앞에 값 추가
            } else if (str.equals("push_front")) {
                Deque.add(0, st.nextToken()); // 두번째 토큰
                // 뒤에 값 추가
            } else if (str.equals("push_back")) {
                Deque.add(st.nextToken()); // 두번째 토큰

            } else if (str.equals("front")) {
                if (Deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    // 가장 앞에 있는 값 출력
                    System.out.println(Deque.get(0));
                }
            } else if (str.equals("back")) {
                if (Deque.isEmpty()) {
                    System.out.println(-1);
                } else {
                    // 가장 뒤에 있는 값 출력
                    System.out.println(Deque.get(Deque.size() - 1));
                }
            }
        }
    }
}
