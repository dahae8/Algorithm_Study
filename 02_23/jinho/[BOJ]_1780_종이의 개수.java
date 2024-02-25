import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int[][] board;
    public static int miOne = 0;
    public static int zero = 0;
    public static int one = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        StringTokenizer st;

        // 보드 입력 받기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 분할 과정 시작
        partition(0, 0, N);

        // 각 색상별로 카운트 출력
        System.out.println(miOne);   // -1
        System.out.println(zero);  // 0
        System.out.println(one);  // 1

    }

    // 보드를 분할하고 값을 세는 재귀 메소드
    public static void partition(int row, int col, int size) {

        // 현재 영역이 동일한 값인지 확인
        if (numCheck(row, col, size)) {
            if (board[row][col] == -1) {
                miOne++;
            } else if (board[row][col] == 0) {
                zero++;
            } else {
                one++;
            }
            return;
        }

        // 현재 영역을 작은 부분 영역으로 나누기
        int newSize = size / 3;

        partition(row, col, newSize);                              // 왼쪽 위
        partition(row, col + newSize, newSize);                    // 중앙 위
        partition(row, col + 2 * newSize, newSize);                // 오른쪽 위

        partition(row + newSize, col, newSize);                    // 왼쪽 중간
        partition(row + newSize, col + newSize, newSize);          // 중앙 중간
        partition(row + newSize, col + 2 * newSize, newSize);      // 오른쪽 중간

        partition(row + 2 * newSize, col, newSize);                // 왼쪽 아래
        partition(row + 2 * newSize, col + newSize, newSize);      // 중앙 아래
        partition(row + 2 * newSize, col + 2 * newSize, newSize);  // 오른쪽 아래

    }

    // 영역이 동일한 색상인지 확인하는 메소드
    public static boolean numCheck(int row, int col, int size) {
        int box = board[row][col];

        // 지정된 영역의 각 셀 확인
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (box != board[i][j]) {
                    return false; // 하나라도 값이 다르면 false
                }
            }
        }
        return true; // 모든 셀이 동일 true
    }

}
