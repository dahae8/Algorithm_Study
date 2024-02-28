import java.io.*;
import java.util.*;

public class Main {

  static class Stack {
    int maxSize;
    private int[] arr;
    int top;

    public Stack(int n) {
      this.arr = new int[n];
      this.maxSize = n;
      this.top = -1;
    }

    public void push(int x) {
      this.arr[++top] = x;
    }

    public int pop() {
      if (top == -1)
        return -1;
      return arr[top--];
    }

    public int size() {
      return top + 1;
    }

    public int empty() {
      if (top == -1)
        return 1;
      return 0;
    }

    public int top() {
      if (top == -1)
        return -1;
      return arr[top];
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
      } else if (order.equals("top")) {
        sb.append(stack.top()).append("\n");
      }
    }
    System.out.println(sb);

  }
}
