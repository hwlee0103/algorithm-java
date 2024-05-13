package java_problemsolving.levelzero.introductionsofps;

import java.util.*;

/**
 * Level : 0
 * Title : 중복된 문자 제거
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-08
 * Solved : 2024-05-13
 *
 * 문제
 * 문자열 my_string이 매개변수로 주어집니다.
 * my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 *
 * 제한사항
 * 1 ≤ my_string ≤ 110
 * my_string은 대문자, 소문자, 공백으로 구성되어 있습니다.
 * 대문자와 소문자를 구분합니다.
 * 공백(" ")도 하나의 문자로 구분합니다.
 * 중복된 문자 중 가장 앞에 있는 문자를 남깁니다.
 *
 * 입출력 예
 * my_string	        result
 * "people"	            "peol"
 * "We are the world"	"We arthwold"
 *
 */
public class EraseRepeatChar {
    public static String solution(String my_string) {
        String answer = "";
        Boolean[] upperAlpha = new Boolean[26];
        Boolean[] lowerAlpha = new Boolean[26];
        Boolean space = false;
        Arrays.fill(upperAlpha, false);
        Arrays.fill(lowerAlpha, false);

        for(Character c : my_string.toCharArray()) {
            if(c == ' ') {
                if(space) continue;
                answer += c;
                space = true;
                continue;
            }
            int idx = c - 'A';
            if(idx >= 26) {
                idx = c - 'a';
                if(lowerAlpha[idx]) continue;
                answer += c;
                lowerAlpha[idx] = true;
            } else {
                if(upperAlpha[idx]) continue;
                answer += c;
                upperAlpha[idx] = true;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(solution(s));
    }
}
