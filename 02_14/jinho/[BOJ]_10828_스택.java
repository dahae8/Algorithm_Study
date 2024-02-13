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

        List<String> stack = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    //마지막 인덱스 삭제 후 출력
                    String lastValue = stack.remove(stack.size() - 1);
                    System.out.println(lastValue);
                }
            } else if (str.equals("size")) {
                System.out.println(stack.size());

            } else if (str.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);

            } else if (str.equals("push")) {
                stack.add(st.nextToken()); // 두번째 토큰

            } else if (str.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    // 마지막 값 출력
                    System.out.println(stack.get(stack.size() - 1));
                }
            }
        }
    }
}
