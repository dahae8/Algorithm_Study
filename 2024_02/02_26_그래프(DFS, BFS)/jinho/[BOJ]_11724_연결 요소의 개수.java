import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점
        int M = Integer.parseInt(st.nextToken()); // 간선

        arr = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        int u, v, count = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            arr[u][v] = 1;
            arr[v][u] = 1;
        }

        for (int i = 1; i < visited.length; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    static void dfs(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i = 1; i < arr[v].length; i++) {
            if (arr[v][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}
