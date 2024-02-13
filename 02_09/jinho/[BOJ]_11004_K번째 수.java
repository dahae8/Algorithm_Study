import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int array[] = new int[N];

        // 두번째 배열 입력 받을 때 사용
        StringTokenizer arraySt = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(arraySt.nextToken());
        }
        Arrays.sort(array);
        System.out.println(array[K - 1]);
    }
}