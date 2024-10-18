package java_problemsolving.levelzero.introductionsofps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 영어가 싫어요
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-15
 * Solved : 2024-05-15
 *
 *
 */
public class DontLikeEng {
    public static long solution(String numbers) {
        long answer = 0;
        Map<String, Integer> mapNums = new HashMap<String, Integer>();
        mapNums.put("zero", 10);
        mapNums.put("one", 1);
        mapNums.put("two", 2);
        mapNums.put("three", 3);
        mapNums.put("four", 4);
        mapNums.put("five", 5);
        mapNums.put("six", 6);
        mapNums.put("seven", 7);
        mapNums.put("eight", 8);
        mapNums.put("nine", 9);

        for(int i = 0 ;i < numbers.length();) {
            for(int j = 3; j <= 5; ++j) {
                String now = numbers.substring(i, i+j);
                if(!mapNums.containsKey(now)) continue;
                if(mapNums.get(now) > 0) {
                    if(mapNums.get(now) == 10) answer *= 10;
                    else answer = answer*10 + mapNums.get(now);
                    i += j;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        System.out.println(solution(numbers));
    }

}
