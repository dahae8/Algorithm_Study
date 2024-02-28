import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static int N, M;
    public static int[] arr;
    public static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 가지고 있는 숫자 카드의 개수
        N = Integer.parseInt(st.nextToken());

        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 정렬

        st = new StringTokenizer(br.readLine());
        // 숫자 카드의 개수
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            answer = 0;
            find(Integer.parseInt(st.nextToken()));
            System.out.print(answer + " ");
        }

    }

    // target : 중간 값보다 작으면 왼쪽, 크거나 같으면 오른쪽 탐색
    public static void find(int target) {
        int start = 0;
        int end = N - 1;

        while (start <= end) {
            // 이진탐색
            int middle = (start + end) / 2;

            if (target == arr[middle]) {
                answer = 1;
                return;
            }

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target >= arr[middle]) {
                start = middle + 1;
            }

        }
    }
}