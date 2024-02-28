import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int 하니까 런타임에러 > long
        // 숫자 카드 N장
        int N = Integer.parseInt(br.readLine());

        long[] numbers = new long[N];
        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());

            numbers[i] = num;
        }

        // 정렬 ( 오름차순 )
        Arrays.sort(numbers);

        long max = 1; // 가장 많이 나온 횟수
        long cnt = 1; // 숫자 순서
        long maxNumber = numbers[0];

        for (int i = 1; i < N; i++) {
            if (numbers[i] == numbers[i - 1]) {
                cnt++;
            } else {
                cnt = 1;
            }

            if (cnt > max || (cnt == max && numbers[i] < maxNumber)) {
                max = cnt;
                maxNumber = numbers[i];
            }
        }
        System.out.println(maxNumber);


    }
}