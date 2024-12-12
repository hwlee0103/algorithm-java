package java_problemsolving.pccpproblems;

import java.util.Scanner;

/**
 * Level : 1
 * Title : [PCCP 기출문제] 1번 / 동영상 재생기
 * 문제 유형 : PCCP 기출문제
 *
 * Started : 2024-12-11
 * Solved : 2024-12-12
 *
34:33
13:00
00:55
02:55
"next", "prev"

10:55
00:05
00:15
06:55
"prev", "next", "next"

10:00
00:03
00:00
00:05
prev, next
-> 00:15
 */

public class VideoPlayer {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        String[] videoTime = video_len.split(":");
        String[] posTime = pos.split(":");
        String[] opStartTime = op_start.split(":");
        String[] opEndTime = op_end.split(":");

        // 전부 '초'로 바꿔서 계산한다면
        int videoTimeInt = Integer.parseInt(videoTime[0]) * 60 + Integer.parseInt(videoTime[1]);
        int posInt = Integer.parseInt(posTime[0]) * 60 + Integer.parseInt(posTime[1]);
        int opStartInt = Integer.parseInt(opStartTime[0]) * 60 + Integer.parseInt(opStartTime[1]);
        int opEndInt = Integer.parseInt(opEndTime[0]) * 60 + Integer.parseInt(opEndTime[1]);

        // 오프닝 시간은 매번 체크
        for(String command : commands) {
            if(opStartInt < posInt && posInt < opEndInt) {
                posInt = opEndInt;
            }

            if(command.equals("prev")) {
                posInt -= 10;
            } else if(command.equals("next")) {
                posInt += 10;
            }

            if(posInt < 0) {
                posInt = 0;
            } else if(posInt > videoTimeInt) {
                posInt = videoTimeInt;
            }

            if(opStartInt <= posInt && posInt <= opEndInt) {
                posInt = opEndInt;
            }
        }

        answer = (posInt / 60 >= 10 ? String.valueOf(posInt / 60) : "0" + posInt / 60) + ":" + (posInt % 60 >= 10 ? String.valueOf(posInt % 60) : "0" + posInt % 60);

        return answer;
    }

    // 시간 계산
    public String[] moveTime(String nowPos, String time, String func) {
        String[] answer = new String[2];
        String[] nowTime = nowPos.split(":");
        String[] addTime = time.split(":");

        if(func.equals("+")) {
            nowTime[1] = String.valueOf(Integer.parseInt(nowTime[1]) + Integer.parseInt(addTime[1]));
            nowTime[0] = String.valueOf(Integer.parseInt(nowTime[0]) + Integer.parseInt(addTime[0]))
                    + String.valueOf(Integer.parseInt(nowTime[1]) / 60);
            nowTime[1] = String.valueOf(Integer.parseInt(nowTime[1]) % 60);
        } else {
            nowTime[1] = String.valueOf(Integer.parseInt(addTime[1]) - Integer.parseInt(nowTime[1]));
            nowTime[0] = String.valueOf(Integer.parseInt(addTime[0]) - Integer.parseInt(nowTime[0]));
            if(Integer.parseInt(nowTime[1]) < 0) {
                nowTime[0] = String.valueOf(Integer.parseInt(nowTime[0]) - 1);
                nowTime[1] = String.valueOf(60 - (-1*Integer.parseInt(nowTime[1])));
            }
        }
        answer[0] = nowTime[0];
        answer[1] = nowTime[1];

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String video_len = input.nextLine();
        String pos = input.nextLine();
        String op_start = input.nextLine();
        String op_end = input.nextLine();
        String[] commands = input.nextLine().replaceAll("\"", "").split(", ");
        System.out.println(new VideoPlayer().solution(video_len, pos, op_start, op_end, commands));
    }
}
