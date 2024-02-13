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

        List<String> Q = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("pop")) {
                if (Q.isEmpty()) {
                    System.out.println(-1);
                } else {
                    //첫번째 인덱스 삭제 후 출력
                    String firstValue = Q.remove(0);
                    System.out.println(firstValue);
                }
            } else if (str.equals("size")) {
                System.out.println(Q.size());

            } else if (str.equals("empty")) {
                System.out.println(Q.isEmpty() ? 1 : 0);

            } else if (str.equals("push")) {
                Q.add(st.nextToken()); // 두번째 토큰

            } else if (str.equals("front")) {
                if (Q.isEmpty()) {
                    System.out.println(-1);
                } else {
                    // 가장 앞에 있는 값 출력
                    System.out.println(Q.get(0));
                }
            } else if (str.equals("back")) {
                if (Q.isEmpty()) {
                    System.out.println(-1);
                } else {
                    // 가장 뒤에 있는 값 출력
                    System.out.println(Q.get(Q.size()-1));
                }
            }
        }
    }
}
