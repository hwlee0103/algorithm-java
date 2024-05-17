package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 한 번만 등장한 문자
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-17
 * Solved : 2024-05-17
 *
 * 문제
 * 문자열 s가 매개변수로 주어집니다.
 * s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
 * 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
 *
 * 제한사항
 * 0 < s의 길이 < 1,000
 * s는 소문자로만 이루어져 있습니다.
 *
 * 입출력 예
 * s	        result
 * "abcabcadc"	"d"
 * "abdc"	    "abcd"
 * "hello"	    "eho"
 *
 */
public class CharOnlyOnce {
    public static String solution(String s) {
        String answer = "";
        int[] alpha = new int[26];
        for(int i = 0; i < s.length() ;++i ){
            alpha[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; ++i) {
            if(alpha[i] == 1) answer += String.valueOf((char)(i + 'a'));
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(solution(s));
    }
}
