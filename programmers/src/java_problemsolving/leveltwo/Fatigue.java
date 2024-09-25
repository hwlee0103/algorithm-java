package java_problemsolving.leveltwo;

import java.util.Scanner;

/**
 * Level : 2
 * Title : 피로도
 * 문제 유형 : 완전탐색
 *
 * Started : 2024-09-04
 * Solved : 2024-09-06
 *
 *
 */
public class Fatigue {
    public static int solution(int k, int[][] dungeons) {
        int answer = 0;

        int[] check = new int[dungeons.length];
        answer = Math.max(answer, game(dungeons, check, k, 0));

        return answer;
    }

    public static int game(int[][] dungeons, int[] check, int k, int cnt) {
        int answer = 0;

        // 주석 된 부분은 1차 문제 해결
//        boolean visit = false;
//        for(int i = 0; i < check.length; i++) {
//            if(check[i] == 0) {
//                visit = false;
//                break;
//            } else {
//                // 전체 방문 완료 시 종료
//                visit = true;
//            }
//        }
//
//        if(visit) return cnt;

        // 주석 안 된 부분이 좀 더 간결하게 푼 풀이
        for(int i = 0; i < dungeons.length; i++) {
            if(check[i] == 0 && k >= dungeons[i][0]) {
                check[i] = 1;
                answer = Math.max(answer, game(dungeons, check, k - dungeons[i][1], cnt + 1));
                check[i] = 0;
            }
//            // 방문 확인
//            if(check[i] == 1) continue;
//
//            // 방문
//            check[i] = 1;
//
//            // 던전 탐험
//            if(k >= dungeons[i][0]) {
//                answer = Math.max(answer, game(dungeons, check, k - dungeons[i][1], cnt + 1));
//            } else {
//                answer = Math.max(answer, game(dungeons, check, k, cnt));
//            }
//
//            // 방문 해제
//            check[i] = 0;
        }

        return Math.max(answer, cnt);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        input.nextLine();
        String[] str = input.nextLine().split("],\\[");
        String[][] spStr = new String[str.length][2];
        int[][] dungeons = new int[str.length][2];
        for(int i = 0; i < str.length; ++i) {
            spStr[i] = str[i].replaceAll("\\[", "").replaceAll("]", "").split(",");
        }
        for(int i = 0; i < spStr.length; ++i) {
            for(int j = 0; j < spStr[i].length; ++j) {
                dungeons[i][j] = Integer.parseInt(spStr[i][j]);
            }
        }

        System.out.println(solution(k, dungeons));
    }
}
