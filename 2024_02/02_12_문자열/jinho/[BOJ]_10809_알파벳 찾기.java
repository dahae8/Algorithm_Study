import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        // 정수 -1이 들어간 배열
        int[] deValue = new int[arr.length];
        for (int i = 0; i < deValue.length; i++) {
            deValue[i] = -1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < S.length(); j++) {
                if (arr[i] == S.charAt(j)) {
                    deValue[i] = j;
                }
                // 처음 등장 위치 출력!
                if (deValue[i] == j) {
                    break;
                }
            }
        }
        for (int i = 0; i < deValue.length; i++) {
            System.out.print(deValue[i] + " ");
        }
    }
}