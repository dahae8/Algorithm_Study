import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null) {
            // line 읽은 한줄씩 추가
            StringBuilder sb = new StringBuilder(line);

            // 소문자 대문자 숫자 공백
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;

            for (int i = 0; i < sb.length(); i++) {
                char ch = sb.charAt(i);
                // isLowerCase : 주어진 문자가 소문자인지 확인
                if (Character.isLowerCase(ch)) {
                    a++;
                }
                // isUpperCase : 주어진 문자가 대문자인지 확인
                if (Character.isUpperCase(ch)) {
                    b++;
                }
                // isDigit : 주어진 문자가 숫자인지 확인
                if (Character.isDigit(ch)) {
                    c++;
                }
                // Character.isSpaceChar : 공백인지 확인하는 메소드
                if (Character.isSpaceChar(ch)) {
                    d++;
                }
            }
            System.out.println(a + " " + b + " " + c + " " + d);
        }
    }
}