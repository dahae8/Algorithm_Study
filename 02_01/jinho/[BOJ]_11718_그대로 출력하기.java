import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        while (inputScanner.hasNextLine()) {
        //while (inputScanner.hasNext()) {

        String printString = inputScanner.nextLine();
        // (조건) 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
        System.out.println(printString.trim());

        }
        inputScanner.close();
    }
}
