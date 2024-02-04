import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int N = inputScanner.nextInt();
        // StringBuilder : 가변적, 문자열 수정 가능
        StringBuilder strB = new StringBuilder();

        int i = 1;
        while (N >= i){
            strB.append(i).append('\n');
            i++;
        }
        System.out.println(strB);
        /*--------------------------------
        for ( int i = N - 1; i >= 0; --i ){
            System.out.println(N - i);
        }
        ________________________________*/
        inputScanner.close();
    }
}
