import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int N = inputScanner.nextInt();
        inputScanner.nextLine();

        String num = inputScanner.nextLine();
        String[] numbers = num.split(" ");

        int[] intNumbers = new int[N]; //N크기 배열
        for ( int i = 0; i < N; i++){
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }

        int minNum = intNumbers[0];
        int maxNum = intNumbers[0];
        // 최솟값,  최댓값
        for(int i = 1; i < N; i++){
            if (intNumbers[i] < minNum ){
                minNum = intNumbers[i];
            }
            if (intNumbers[i] > maxNum ){
                maxNum = intNumbers[i];
            }
        }
        System.out.println(minNum + " " + maxNum);
        inputScanner.close();
    }
}
