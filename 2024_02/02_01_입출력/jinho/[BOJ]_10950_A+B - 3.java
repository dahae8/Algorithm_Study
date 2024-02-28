import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int T = inputScanner.nextInt();

        while (T > 0) {

            int A = inputScanner.nextInt();
            int B = inputScanner.nextInt();

            T -= 1;

            System.out.println(A + B);

        }

        inputScanner.close();

        /*--------------------------------------------------
        // for //
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("T 입력");
        int T = inputScanner.nextInt();

        for (int i = 0; i < T; i++) {

            int A = inputScanner.nextInt();
            int B = inputScanner.nextInt();

            System.out.println(A + B);

        }

        inputScanner.close();
        --------------------------------------------------*/



    }
}
