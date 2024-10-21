package java_problemsolving.levelzero.introductionsofps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 캐릭터의 좌표
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-28
 * Solved : 2024-05-28
 *
 *
 */
public class CoordinatesOfCharacter {
    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        String[] direction = {"up", "down", "left", "right"};
        int[][] coordinates = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        Map<String, int[]> moves = new HashMap<>();
        for(int i = 0; i < 4; ++i) {
            moves.put(direction[i], coordinates[i]);
        }

        for(int i = 0; i < keyinput.length; ++i) {
            int nowX = answer[0] + moves.get(keyinput[i])[0];
            int nowY = answer[1] + moves.get(keyinput[i])[1];
            if(nowX > board[0]/2 || nowX < (board[0]/2) * -1) continue;
            if(nowY > board[1]/2 || nowY < (board[1]/2) * -1) continue;
            answer[0] += moves.get(keyinput[i])[0];
            answer[1] += moves.get(keyinput[i])[1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replaceAll("\"", "");
        String[] keyinput = str.split(", ");
        String strbd = input.nextLine();
        String[] spStr = strbd.split(", ");
        int[] board = new int[2];
        board[0] = Integer.parseInt(spStr[0]);
        board[1] = Integer.parseInt(spStr[1]);

        int[] ans = solution(keyinput, board);
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }
}
