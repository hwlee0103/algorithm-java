package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Level : 2
 * Title : 할인 행사
 * 문제 유형 : 연습문제
 *
 * Started : 2024-10-04
 * Solved : 2024-10-
 *
 *
 */
public class DiscountEvent {
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int totalCnt = 0;
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < want.length; ++i) {
            map.put(want[i], number[i]);
            totalCnt += number[i];
        }

        for(int i = 0; i < discount.length - 10; ++i) {
            Map<String, Integer> tmpMap = new HashMap<>(map);
            int totalTmp = totalCnt;
            for(int j = i; j < i + 10; ++j) {
                if(tmpMap.containsKey(discount[j])) {
                    tmpMap.put(discount[j], tmpMap.get(discount[j]) - 1);
                    totalTmp--;
                } else {
                    break;
                }
            }
            if(totalTmp == 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] want = input.nextLine().replaceAll("\"", "").split(", ");
        int[] number = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        String[] discount = input.nextLine().replaceAll("\"", "").split(", ");
        System.out.println(solution(want, number, discount));
    }
}
