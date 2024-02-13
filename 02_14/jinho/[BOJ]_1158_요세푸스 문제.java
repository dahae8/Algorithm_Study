import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 인원수
        int K = Integer.parseInt(st.nextToken()); // 순서간격

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();

        sb.append('<');
        while (!list.isEmpty()) { // 리스트 비어 있을 때 까지 반복
            // K번째 사람 찾기
            for (int i = 0; i < K; i++) {

                // K번째 사람 일 때
                // 1번 사람 부터 시작하기에 k-1
                if (i == K - 1) {
                    // 리스트의 크기가 1이면 마지막 인원
                    // sb에 추가하고 인원은 리스트에서 제거
                    if (list.size() == 1) {
                        sb.append(list.remove());
                    } else {
                        sb.append(list.remove() + ", ");
                    }

                // K 번째가 아니면 리스트의 첫 번째 인원을 맨 뒤로
                } else {
                    list.add(list.remove());
                }
            }
        }
        sb.append('>');

        System.out.println(sb);
    }
}