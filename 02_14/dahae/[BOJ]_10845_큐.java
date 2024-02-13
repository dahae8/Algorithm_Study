import java.io.*;
import java.util.*;

public class Main {

    static class Stack {
        int maxSize;
        private int[] arr;
        int f;
        int b;

        public Stack(int n) {
            this.arr = new int[n];
            this.maxSize = n;
            this.f = 0;
            this.b = -1;
        }

        public void push(int x) {
            this.arr[++b] = x;
        }

        public int pop() {
            if (f>b)
                return -1;
            return arr[f++];
        }

        public int size() {
            return b-f+1;
        }

        public int empty() {
            if (f>b)
                return 1;
            return 0;
        }

        public int front() {
            if (f>b)
                return -1;
            return arr[f];
        }
        public int back() {
            if (f>b)
                return -1;
            return arr[b];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        Stack stack = new Stack(t);
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if (order.equals("push")) {
                int a = Integer.parseInt(st.nextToken());
                stack.push(a);
            } else if (order.equals("pop")) {
                sb.append(stack.pop()).append("\n");
            } else if (order.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (order.equals("empty")) {
                sb.append(stack.empty()).append("\n");
            } else if (order.equals("front")) {
                sb.append(stack.front()).append("\n");
            }
            else{
                sb.append(stack.back()).append("\n");
            }

        }
        System.out.println(sb);

    }
}
