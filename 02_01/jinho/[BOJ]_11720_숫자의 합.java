import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int N = inputScanner.nextInt();
        inputScanner.nextLine();

        String number = inputScanner.nextLine();

        String[] numbers = number.split("");

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(numbers[i]);
        }
        System.out.println(sum);
        inputScanner.close();
    }
}
