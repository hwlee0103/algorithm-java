package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : A로 B 만들기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-20
 * Solved : 2024-06-20
 *
 *
 */
public class MakeBwithA {
    public static int solution(String before, String after) {
        int answer = 1;
        int[] alpha = new int[26];
        for(int i = 0; i < before.length(); ++i) {
            alpha[before.charAt(i) - 'a']++;
        }
        for(int i = 0; i < after.length(); ++i) {
            alpha[after.charAt(i) - 'a']--;
        }

        for(int i = 0; i < alpha.length; ++i) {
            if(alpha[i] != 0) {
                answer = 0;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String before = input.nextLine();
        String after = input.nextLine();
        System.out.println(solution(before, after));
    }
}
