import java.io.*;
import java.util.*;

class Score {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }
}

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 학생의 수
        int N = Integer.parseInt(br.readLine());

        Score[] scores = new Score[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            scores[i] = new Score(name, kor, eng, math);
        }

        // 국어 점수가 감소하는 순서( 내림차순 )
        Arrays.sort(scores, Comparator.comparingInt(Score::getKor).reversed()
                // 국어 점수가 같으면 영어 점수가 증가하는 순서 ( 오름차순 )
                .thenComparing(Comparator.comparingInt(Score::getEng))
                // 국어 점수와 영어점수가 같으면 수학 점수가 감소하는 순서 ( 내림차순 )
                .thenComparing(Comparator.comparingInt(Score::getMath).reversed())
                // 모든 점수가 같으면 이름이 사전 순으로 증가하는 순서 ( 오름차순 )
                .thenComparing(Score::getName));


        for (Score score : scores) {
            System.out.println(score.getName());
        }

    }
}