import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int A = inputScanner.nextInt();
        int B = inputScanner.nextInt();

        System.out.println(A + B);

        inputScanner.close();


        /*--------------------------------------------
        // Scanner : 사용자 입력받기
        Scanner inputScanner = new Scanner(System.in);

        // 정수 입력 받기
        System.out.println("정수 A : ");
        int A = inputScanner.nextInt();

        System.out.println("정수 B : ");
        int B = inputScanner.nextInt();

        // 정수 덧셈
        System.out.println("A + B = " + (A+B));

        // Scanner 닫기
        inputScanner.close();
        --------------------------------------------*/
    }
}
