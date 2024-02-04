import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int N = inputScanner.nextInt();

        // 위
        for (int i = 1; i <= N; i++) {
            // 공백
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래
        for (int i = N - 1; i > 0; i--) {

            // 공백
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }

        inputScanner.close();
    }
}
