import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();
        String C = st.nextToken();
        String D = st.nextToken();

        // AB CD 붙이기
        long num1 = Long.parseLong(A+B);
        long num2 = Long.parseLong(C+D);

        // 붙인 수의 합
        System.out.println(num1 + num2);

        // 메모 : 100만이상의 수를 이어 붙이기엔 Int형은 너무 작다 -> 런타임 에러
    }
}