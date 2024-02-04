import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int N = inputScanner.nextInt();

        int sum = 0;
        while ( N > 0 ){
            sum += N;
            N--;
        }
        System.out.println(sum);
        inputScanner.close();
    }
}
