import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int N = inputScanner.nextInt();

        while ( N > 0 ){
            System.out.println(N);
            N--;
        }

        inputScanner.close();
    }
}
