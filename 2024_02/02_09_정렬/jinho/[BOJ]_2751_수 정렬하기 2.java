import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());

        int array[] = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(array); // 오름차순

        for (int i : array) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}