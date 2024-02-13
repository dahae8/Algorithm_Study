import java.io.*;
import java.util.*;

class User {
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // 온라인 회원 수
        int N = Integer.parseInt(br.readLine());

        User[] users = new User[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            users[i] = new User(age, name);

        }

        // 정렬
        Arrays.sort(users, Comparator.comparingInt(User::getAge));

        for ( User user : users ){
            System.out.println(user.getAge() + " " + user.getName());
        }


    }

}