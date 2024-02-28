import java.io.*;
import java.util.*;

public class Main {

  static class Deque {
    int maxSize;
    private int[] arr;
    int f;
    int b;

    public Deque(int n) {
      this.arr = new int[2 * n];
      this.maxSize = n;
      this.f = n;
      this.b = n - 1;
    }

    public void push_front(int x) {
      this.arr[--f] = x;
    }

    public void push_back(int x) {
      this.arr[++b] = x;
    }

    public int pop_front() {
      if (f > b)
        return -1;
      return arr[f++];
    }

    public int pop_back() {
      if (f > b)
        return -1;
      return arr[b--];
    }

    public int size() {
      return b - f + 1;
    }

    public int empty() {
      if (f > b)
        return 1;
      return 0;
    }

    public int front() {
      if (f > b)
        return -1;
      return arr[f];
    }

    public int back() {
      if (f > b)
        return -1;
      return arr[b];
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(br.readLine());
    Deque deque = new Deque(t);
    for (int i = 0; i < t; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String order = st.nextToken();
      if (order.equals("push_front")) {
        int a = Integer.parseInt(st.nextToken());
        deque.push_front(a);
      } else if (order.equals("push_back")) {
        int a = Integer.parseInt(st.nextToken());
        deque.push_back(a);
      } else if (order.equals("pop_front")) {
        sb.append(deque.pop_front()).append("\n");
      } else if (order.equals("pop_back")) {
        sb.append(deque.pop_back()).append("\n");
      } else if (order.equals("size")) {
        sb.append(deque.size()).append("\n");
      } else if (order.equals("empty")) {
        sb.append(deque.empty()).append("\n");
      } else if (order.equals("front")) {
        sb.append(deque.front()).append("\n");
      } else {
        sb.append(deque.back()).append("\n");
      }

    }
    System.out.println(sb);

  }
}
