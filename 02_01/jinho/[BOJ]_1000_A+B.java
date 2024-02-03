import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner : 사용자한테 입력 받기
        Scanner inputScanner = new Scanner(System.in);

        // 정수 입력 받기
        int A = inputScanner.nextInt();
        int B = inputScanner.nextInt();

        // 입력 받은 정수 더하기
        System.out.println(" A + B = " + (A + B));

        // Scanner 닫기
        inputScanner.close();

        /*--------------------------------------------
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("정수 A + B를 입력하세요: ");

        int A = inputScanner.nextInt();
        int B = inputScanner.nextInt();

        System.out.println("A + B = " + (A + B));

        inputScanner.close();
        ----------------------------------------------*/
    }
}
