package java_problemsolving.levelone;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Level : 1
 * Title : 완주하지 못한 선수
 * 문제 유형 : 해시
 *
 * Started : 2024-09-06
 * Solved : 2024-09-06
 *
 *
 */
public class DidntFinishRace {
    private static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0;i < completion.length; ++i) {
            if(!map.containsKey(completion[i])) {
                map.put(completion[i], 1);
            } else {
                map.put(completion[i], map.get(completion[i]) + 1);
            }
        }

        for(int i = 0; i < participant.length; ++i) {
//            map.getOrDefault(participant[i], 0);
//            System.out.println(map.entrySet());
            if(!map.containsKey(participant[i]) || map.get(participant[i]) == 0) {
                answer = participant[i];
                break;
            } else {
                map.put(participant[i], map.get(participant[i]) - 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine().replaceAll("\"", "").split(", "), input.nextLine().replaceAll("\"", "").split(", ")));
    }
}
