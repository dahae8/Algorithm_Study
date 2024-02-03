import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        while (true) {

            int A = inputScanner.nextInt();
            int B = inputScanner.nextInt();

            if (A == 0 || B == 0) {
                break;
            }
            System.out.println(A + B);
        }
        inputScanner.close();
    }
}
