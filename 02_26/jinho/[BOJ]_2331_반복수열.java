import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        list.add(A);

        while (true) {
            int temp = list.get(list.size() - 1); // 현재 수열의 마지막 값

            int result = 0;

            // 각 자리의 숫자를 P 제곱해서 더하기
            while (temp != 0) {
                result += (int) Math.pow(temp % 10, (double) P); // 일의 자리
                temp /= 10; // 십의 자리
            }

            // 수열에서 중복 된 값이 나오면 인덱스 출력 후 종료
            // contains : 값 존재 - true
            if (list.contains(result)) {
                // 값이 처음으로 나타나는 인덱스 반환
                int ans = list.indexOf(result);
                System.out.println(ans);
                break;
            }

            list.add(result);
        }

        br.close();
    }

}