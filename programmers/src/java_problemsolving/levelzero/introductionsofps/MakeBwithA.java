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
 * 문제
 * 문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 0 < before의 길이 == after의 길이 < 1,000
 * before와 after는 모두 소문자로 이루어져 있습니다.
 *
 * 입출력 예
 * before	after	result
 * "olleh"	"hello"	1
 * "allpe"	"apple"	0
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
