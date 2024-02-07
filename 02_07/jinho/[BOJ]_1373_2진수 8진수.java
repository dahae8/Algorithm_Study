import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader : System.in 에서 데이터 읽어오기 위한 객체 생성 / 문자열을 읽음
        // new InputStreamReader : 바이트 스트림을 문자 스트림으로 변환
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        // 2진수 > 8진수
        String octal = convert(input);
        System.out.println(octal);

    }

    // 2진수 > 8진수
    static  String convert(String input) {

        // 2진수 문자열을 8진수로 변환하기
        // 2진수를 3자리씩 나눈다.
        // 각 3자리의 2진수를 10진수로 바꾼다.
        // 10진수를 8진수로 바꾼다.

        StringBuilder result = new StringBuilder();
        int length = input.length();

        // 2진수의 자리가 3의 배수가 아닐경우 앞에 0채우기
        while (length % 3 != 0) {
            input = "0" + input;
            length++;
        }

        // 3자리씩 끊어 8진수 변환
        for (int i = 0; i < length; i+= 3){
            // substring : 문자열에서 일부분 추출 [인덱스]
            String three = input.substring(i, i+3);
            int decimal = Integer.parseInt(three,2);// 문자열을 2진수로
            result.append(Integer.toOctalString(decimal)); // 8진수변환
        }

        return result.toString();
    }
}
