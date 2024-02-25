import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 배열 A 크기 : N | B 크기 : M
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N+M];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int j = N; j<N+M; j++){
            arr[j] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        StringBuffer sb = new StringBuffer();
        for(int num : arr){
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}