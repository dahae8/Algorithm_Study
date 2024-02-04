import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int N = inputScanner.nextInt();

        for (int i = 1; i <= N; i++) {
            // 공백
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            if (i > 1 && i < N) {
                for (int m = 1; m <= (i - 1) * 2 - 1; m++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else{
                for ( int k = 1; k < (i * 2) - 1; k++){
                    System.out.print("*");
                }
            }
            System.out.println();

        }

        inputScanner.close();
        /*--------------------------------------
        for (int i = 1; i <= N; i++) {
            // 공백
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int m = 1; m < i; m++) {
                System.out.print(" *");
            }
            System.out.println();

        }
        inputScanner.close();
        ----------------------------------------*/
    }
}

