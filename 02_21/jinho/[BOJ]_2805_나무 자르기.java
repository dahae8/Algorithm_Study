import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] trees;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 나무의 수
        int M = Integer.parseInt(st.nextToken()); // 가져가려는 나무 길이

        trees = new int[N];
        int max = 0;
        int min = 0;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            max = Math.max(trees[i], max);
        }

        while (min < max) {
            int mid = (min + max) / 2;
            long sum = cut(mid);

            if (sum < M) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }

    static long cut(int height) {
        long result = 0;
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] > height) {
                result += trees[i] - height;
            }
        }
        return result;
    }
}