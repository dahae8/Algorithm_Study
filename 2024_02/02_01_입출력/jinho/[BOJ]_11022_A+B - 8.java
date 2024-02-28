import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int T = inputScanner.nextInt();

        for (int i = 1; i <= T; i++) {

            int A = inputScanner.nextInt();
            int B = inputScanner.nextInt();

            String printString = String.format("Case #%d: %d + %d = %d", i, A, B, A+B);
            System.out.println(printString);
        }
        inputScanner.close();
    }
}
