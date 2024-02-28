import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String[] arr = new String[T];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = st.nextToken();
        }

        for (String str : arr) {
            int leftCount = 0;

            for (int k = 0; k < str.length(); k++) {
                char ch = str.charAt(k);
                if (ch == '(') {
                    leftCount++;
                } else if (ch == ')') {
                    leftCount--;
                }
                if (leftCount < 0) {
                    // ')'가 '(' 보다 먼저 나온 경우
                    // ex : )))(((
                    break;
                }
            }

            if (leftCount == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
