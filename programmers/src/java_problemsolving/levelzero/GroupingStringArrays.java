package java_problemsolving.levelzero;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 묶기
 * 문제 유형 : 함수(메소드)
 *
 * Started : 2024-08-27
 * Solved : 2024-08-27
 *
 *
 */
public class GroupingStringArrays {
    public static int solution(String[] strArr) {
        int maxCnt = 0;
        Map<Integer, Integer> lenMap = new HashMap<>();
        for(String item: strArr) {
            if(lenMap.containsKey(item.length())) {
                lenMap.put(item.length(), lenMap.get(item.length()) + 1);
                maxCnt = Math.max(maxCnt, lenMap.get(item.length()));
            } else {
                lenMap.put(item.length(), 1);
                maxCnt = Math.max(maxCnt, lenMap.get(item.length()));
            }
        }

        return maxCnt;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine().split(",")));
    }
}
