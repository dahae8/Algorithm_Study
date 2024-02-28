import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 문자열 S
        String S = br.readLine();

        // 접미사 배열
        String[] arr = new String[S.length()];

        // 접미사 배열에 넣기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.substring(i, arr.length);
        }

        // 정렬
        Arrays.sort(arr);

        StringBuffer sb = new StringBuffer();
        for (String i : arr) {
            sb.append(i).append("\n");
        }
        System.out.print(sb);
    }
}