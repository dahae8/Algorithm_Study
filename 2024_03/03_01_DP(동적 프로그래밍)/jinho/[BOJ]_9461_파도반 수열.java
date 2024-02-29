import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            // int -> Long
            ArrayList<Long> list = new ArrayList<Long>();
            for (int j = 0; j < 3; j++) {
                list.add(1L);
            }
            int l = 0;
            int r = 1;
            for (int k = 0; k < N - 3; k++) {

                long num = list.get(l) + list.get(r);
                list.add(num);
                l++;
                r++;
            }
            if (N < 3) {
                sb.append(1).append("\n");
            } else {
                sb.append(list.get(list.size() - 1)).append("\n");;
            }
        }
        System.out.println(sb);
    }
}
