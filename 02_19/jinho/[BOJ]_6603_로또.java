import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            // k 입력
            int K = Integer.parseInt(st.nextToken());

            if (K == 0) {
                break; // 입력 0 : 종료
            }

            // 집합 S 입력
            ArrayList<Integer> S = new ArrayList<>();
            for (int i = 0; i < K; i++) {
                S.add(Integer.valueOf(st.nextToken()));
            }
            System.out.println("size : " + S.size());

            LottoNumbers(S, 6);
            System.out.println();
        }
    }

    // 수를 고르는 방법
    public static void LottoNumbers(ArrayList<Integer> S, int K) {
        ArrayList<Integer> chosenNum = new ArrayList<>();
        Combi(S, K, 0, chosenNum);
    }

    private static void Combi(ArrayList<Integer> S, int K, int startIndex, ArrayList<Integer> chosenNum) {
        if (K == 0) { // 0을 입력하면 내용 출력
            // K개의 수를 선택한 경우 출력
            for (int num : chosenNum) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
            // K가 0일 때, return 호출 -> 해당 호출 스택이 종료되고, 이전 호출 스택으로 돌아감
        }

        for (int i = startIndex; i < S.size(); i++) {
            chosenNum.add(S.get(i));
            //System.out.println( "i"+i);
            //System.out.println( "S"+startIndex);
            //System.out.println("C"+chosenNum);
            Combi(S, K - 1, i + 1, chosenNum);
            chosenNum.remove(chosenNum.size() - 1);
        }
    }
}
