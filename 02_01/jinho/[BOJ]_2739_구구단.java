import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int N = inputScanner.nextInt();

        for ( int i = 1; i < 10; i++ ){
            String printString = String.format("%d * %d = %d", N, i, N*i);
            System.out.println(printString);
        }

        inputScanner.close();
    }
}
