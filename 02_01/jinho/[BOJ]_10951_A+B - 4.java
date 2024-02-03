import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);


        // hasNext() : boolean 반환, 읽을 거 없으면 false
        while (inputScanner.hasNext()) {

            int A = inputScanner.nextInt();
            int B = inputScanner.nextInt();
            System.out.println(A + B);

        }

        inputScanner.close();
    }
}
