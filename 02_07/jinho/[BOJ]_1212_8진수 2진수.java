import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        boolean start = true;

        // 0일 때
        if (s.length() == 1 && s.substring(0, 1).equals("0")) {
            System.out.print(0);
        }

        for (int i = 0; i < s.length(); i++) {
            int n = Integer.parseInt(s.substring(i, i + 1));

            // 첫째 자리이면서 해당 숫자가 3자리가 아닌 2진수로 표현 된 경우
            if (start == true && n < 4) {
                if (n == 0) {
                    continue;
                } else if (n == 1) {
                    System.out.print("1");
                } else if (n == 2) {
                    System.out.print("10");
                } else if (n == 3) {
                    System.out.print("11");
                }
                start = false; // 다음 자리수에서 조건이 걸리지 않게 false
            } else {
                // 8진수를 3자리 이진수로
                String[] eight = {"000", "001", "010", "011", "100", "101", "110", "111"};
                System.out.print(eight[n]);
                start = false;
            }
        }
    }
}
