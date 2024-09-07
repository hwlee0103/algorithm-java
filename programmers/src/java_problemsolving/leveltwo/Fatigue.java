package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 2
 * Title : 피로도
 * 문제 유형 : 완전탐색
 *
 * Started : 2024-09-04
 * Solved : 2024-09-
 *
 * 문제
 * XX게임에는 피로도 시스템(0 이상의 정수로 표현합니다)이 있으며,
 * 일정 피로도를 사용해서 던전을 탐험할 수 있습니다.
 * 이때, 각 던전마다 탐험을 시작하기 위해 필요한 "최소 필요 피로도"와 던전 탐험을 마쳤을 때 소모되는
 * "소모 피로도"가 있습니다.
 * "최소 필요 피로도"는 해당 던전을 탐험하기 위해 가지고 있어야 하는 최소한의 피로도를 나타내며,
 * "소모 피로도"는 던전을 탐험한 후 소모되는 피로도를 나타냅니다. 예를 들어 "최소 필요 피로도"가 80,
 * "소모 피로도"가 20인 던전을 탐험하기 위해서는 유저의 현재 남은 피로도는 80 이상 이어야 하며,
 * 던전을 탐험한 후에는 피로도 20이 소모됩니다.
 *
 * 이 게임에는 하루에 한 번씩 탐험할 수 있는 던전이 여러개 있는데,
 * 한 유저가 오늘 이 던전들을 최대한 많이 탐험하려 합니다.
 * 유저의 현재 피로도 k와 각 던전별 "최소 필요 피로도",
 * "소모 피로도"가 담긴 2차원 배열 dungeons 가 매개변수로 주어질 때,
 * 유저가 탐험할수 있는 최대 던전 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * k는 1 이상 5,000 이하인 자연수입니다.
 * dungeons의 세로(행) 길이(즉, 던전의 개수)는 1 이상 8 이하입니다.
 * dungeons의 가로(열) 길이는 2 입니다.
 * dungeons의 각 행은 각 던전의 ["최소 필요 피로도", "소모 피로도"] 입니다.
 * "최소 필요 피로도"는 항상 "소모 피로도"보다 크거나 같습니다.
 * "최소 필요 피로도"와 "소모 피로도"는 1 이상 1,000 이하인 자연수입니다.
 * 서로 다른 던전의 ["최소 필요 피로도", "소모 피로도"]가 서로 같을 수 있습니다.
 *
 * 입출력 예
 * k	dungeons	                result
 * 80	[[80,20],[50,40],[30,10]]	3
 *
 * 입출력 예 설명
 * 현재 피로도는 80입니다.
 * 만약, 첫 번째 → 두 번째 → 세 번째 던전 순서로 탐험한다면
 * 현재 피로도는 80이며, 첫 번째 던전을 돌기위해 필요한 "최소 필요 피로도" 또한 80이므로, 첫 번째 던전을 탐험할 수 있습니다. 첫 번째 던전의 "소모 피로도"는 20이므로, 던전을 탐험한 후 남은 피로도는 60입니다.
 * 남은 피로도는 60이며, 두 번째 던전을 돌기위해 필요한 "최소 필요 피로도"는 50이므로, 두 번째 던전을 탐험할 수 있습니다. 두 번째 던전의 "소모 피로도"는 40이므로, 던전을 탐험한 후 남은 피로도는 20입니다.
 * 남은 피로도는 20이며, 세 번째 던전을 돌기위해 필요한 "최소 필요 피로도"는 30입니다. 따라서 세 번째 던전은 탐험할 수 없습니다.
 * 만약, 첫 번째 → 세 번째 → 두 번째 던전 순서로 탐험한다면
 * 현재 피로도는 80이며, 첫 번째 던전을 돌기위해 필요한 "최소 필요 피로도" 또한 80이므로, 첫 번째 던전을 탐험할 수 있습니다. 첫 번째 던전의 "소모 피로도"는 20이므로, 던전을 탐험한 후 남은 피로도는 60입니다.
 * 남은 피로도는 60이며, 세 번째 던전을 돌기위해 필요한 "최소 필요 피로도"는 30이므로, 세 번째 던전을 탐험할 수 있습니다. 세 번째 던전의 "소모 피로도"는 10이므로, 던전을 탐험한 후 남은 피로도는 50입니다.
 * 남은 피로도는 50이며, 두 번째 던전을 돌기위해 필요한 "최소 필요 피로도"는 50이므로, 두 번째 던전을 탐험할 수 있습니다. 두 번째 던전의 "소모 피로도"는 40이므로, 던전을 탐험한 후 남은 피로도는 10입니다.
 * 따라서 이 경우 세 던전을 모두 탐험할 수 있으며, 유저가 탐험할 수 있는 최대 던전 수는 3입니다.
 *
 * ※ 공지 - 2022년 2월 25일 테스트케이스가 추가되었습니다.
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