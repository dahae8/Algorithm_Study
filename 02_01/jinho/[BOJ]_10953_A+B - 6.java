import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int T = inputScanner.nextInt();
        // ★ Enter 제거
        inputScanner.nextLine();

        for (int i = 0; i < T; i++) {
            // A , B 형식
            String comma = inputScanner.nextLine();

            String[] commaLine = comma.split(",");
            // Integer.parseInt() : 문자열 정수로 변환
            int A = Integer.parseInt(commaLine[0]);
            int B = Integer.parseInt(commaLine[1]);

            System.out.println(A + B);
        }
        inputScanner.close();
    }
}
