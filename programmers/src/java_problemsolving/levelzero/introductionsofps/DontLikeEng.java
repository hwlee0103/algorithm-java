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
 * 문제
 * 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
 * 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * numbers는 소문자로만 구성되어 있습니다.
 * numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이 공백 없이 조합되어 있습니다.
 * 1 ≤ numbers의 길이 ≤ 50
 * "zero"는 numbers의 맨 앞에 올 수 없습니다.
 *
 * 입출력 예
 * numbers	                                result
 * "onetwothreefourfivesixseveneightnine"	123456789
 * "onefourzerosixseven"	                14067
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
