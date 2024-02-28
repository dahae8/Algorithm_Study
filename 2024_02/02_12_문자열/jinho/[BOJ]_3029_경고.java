import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 현재시간
        String T = br.readLine();
        // 나트륨 던진 시간
        String W = br.readLine();

        // hh : mm : ss
        String[] time = T.split(":");
        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);
        int second = Integer.parseInt(time[2]);

        String[] wTime = W.split(":");
        int wHour = Integer.parseInt(wTime[0]);
        int wMinute = Integer.parseInt(wTime[1]);
        int wSecond = Integer.parseInt(wTime[2]);

        int diffHour = wHour - hour;
        int diffMinute = wMinute - minute;
        int diffSecond = wSecond - second;

        if (diffSecond < 0) {
            diffSecond += 60;
            diffMinute -= 1;
        }
        if (diffMinute < 0) {
            diffMinute += 60;
            diffHour -= 1;
        }
        if (diffHour < 0) {
            diffHour += 24;
        }
        // 반례 ) 00:00:00 00:00:00일때, 조건 : 최소 1초 최대 24시간 대기
        // 시간이 같은 경우
        if (diffHour == 0 && diffMinute == 0 && diffSecond == 0) {
            diffHour = 24;
        }
        System.out.printf("%02d:%02d:%02d", diffHour, diffMinute, diffSecond);

    }
}