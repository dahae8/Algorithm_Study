import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String inputString = inputScanner.nextLine();

        // ( 조건1 ) : 열 개씩 끊어서 한 줄에 하나씩 출력
        int size = 10;
        for ( int i = 0; i < inputString.length(); i += size) {

            // ( 조건2 ) : 단어의 길이가 10의 배수가 아닌 경우, 10개 미만 출력
            // 10배수, 문자열 전체 길이
            int limit = Math.min( i + size, inputString.length());

            String subString = inputString.substring(i, limit);
            System.out.println(subString);
        }
        inputScanner.close();
    }
}
