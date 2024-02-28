import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int N = inputScanner.nextInt();

        for (int i = 1; i <= N; i++){
            // 공백
            for (int m = 0; m < N - i; m++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        inputScanner.close();

    }
}
