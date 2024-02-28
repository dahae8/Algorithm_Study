import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] tree;
    static boolean[] visited;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        tree = new ArrayList[N + 1];
        visited = new boolean[N + 1]; // 기본 값 false
        parent = new int[N + 1];

        for (int i = 0; i < N + 1; i++) // 초기화
            tree[i] = new ArrayList<>();


        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree[a].add(b);
            tree[b].add(a);
        }

        // 트리의 루트를 1이라고
        for (int i = 1; i < N + 1; i++) {
            dfs(i);
        }

        // 2번 노드부터 순서대로
        for (int i = 2; i < N + 1; i++) {
            System.out.println(parent[i]);
        }
    }

    static void dfs(int v) {
        visited[v] = true;
        for (int t : tree[v]) {
            if (!visited[t]) {
                // 방문 안했다면
                parent[t] = v;
                dfs(t);
            }
        }
    }
}