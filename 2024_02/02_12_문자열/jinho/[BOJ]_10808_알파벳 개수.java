import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();

        // 타입이 문자열이 아니라 문자여야 한다. 에러 //
        //String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        // 정수 0이 들어간 배열
        int[] count = new int[arr.length];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < name.length(); j++) {
                if (arr[i] == (name.charAt(j))) {
                    count[i] += 1;
                }
            }

        }

        for (int i = 0; i < count.length; i++) {

            System.out.print(count[i] + " ");
        }

    }
}