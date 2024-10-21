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
