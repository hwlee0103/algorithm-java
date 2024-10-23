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
