import static java.lang.Integer.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 입력
        String str = br.readLine();
        // 문자 저장하는 리스트생성 Character
        List<Character> list = new LinkedList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }

        // 명령의 개수
        int cnt = parseInt(br.readLine());

        // ListIterator : 리스트의 커서생성, 맨 마지막에 생성
        ListIterator<Character> listRe = list.listIterator(list.size());

        // 명령 저장
        for (int i = 0; i < cnt; i++) {
            String action = br.readLine();
            String[] actionTokens = action.split(" ");
            char cmd = actionTokens[0].charAt(0);

            switch (cmd) {
                case 'L': // L : 커서를 왼쪽. 맨 앞 무시
                    // hasPrevious : 커서의 이전 위치에 값이 있는지 확인
                    if (listRe.hasPrevious()) {
                        listRe.previous(); // 커서 왼쪽으로 이동
                    }
                    break; // 이전 값이 없을 때 : 맨 앞 일때 -> break


                case 'D': // D : 커서를 오른쪽. 맨 뒤 무시
                    // hasNext : 커서의 다음 위치에 값이 있는지 확인
                    if (listRe.hasNext()) {
                        listRe.next(); // 커서 오른쪽으로 이동
                    }
                    break; // 다음 값이 없을 때 : 맨 뒤 일때 -> break


                case 'B': // B : 커서 왼쪽 문자 삭제. 맨 앞 무시
                    if (listRe.hasPrevious()) {
                        listRe.previous(); // 왼쪽으로 이동
                        listRe.remove(); // 왼쪽 문자 삭제
                    }
                    break;

                case 'P': // P *: 입력 받은 문자(*) 커서 왼쪽에 추가
                    char ch = actionTokens[1].charAt(0); // ex : ["P", "x"]
                    listRe.add(ch);
                    break;
            }
        }
        StringBuilder result = new StringBuilder();

        listRe = list.listIterator();
        while (listRe.hasNext()) {
            result.append(listRe.next());
        }
        System.out.println(result);
    }
}
