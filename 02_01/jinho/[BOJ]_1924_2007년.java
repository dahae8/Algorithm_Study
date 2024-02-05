import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner InputScanner = new Scanner(System.in);

        int x = InputScanner.nextInt();
        int y = InputScanner.nextInt();

        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;

        for (int i = 0; i < x - 1; i++) {
            totalDays += month[i];
        }
        totalDays += y;

        int Week = totalDays % 7;

        switch (Week) {
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 0:
                System.out.println("SUN");
                break;
        }

        InputScanner.close();
    }
}
