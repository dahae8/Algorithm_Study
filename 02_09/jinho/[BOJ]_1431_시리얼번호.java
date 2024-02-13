import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        for (int i = 0; i < N; i++)
            arr[i] = br.readLine();

        // 정렬 기준은 Comparator를 이용
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 길이 비교
                if (o1.length() - o2.length() == 0) {
                    // 문자열에 숫자값의 합 비교
                    int a = getNumericSum(o1);
                    int b = getNumericSum(o2);

                    // 알파벳 순서로 비교
                    if (a - b == 0) {
                        return o1.compareTo(o2);
                    } else {
                        return a - b;
                    }
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        for (String s : arr)
            System.out.println(s);
    }

    // 문자열에 포함된 숫자값의 합을 계산하는 메소드
    public static int getNumericSum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum; // 최종 숫자값의 합 반환
    }
}
