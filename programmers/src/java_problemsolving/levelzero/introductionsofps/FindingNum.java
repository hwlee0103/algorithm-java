package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 숫자 찾기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-19
 * Solved : 2024-05-19
 *
 * 문제
 * 두 배열이 얼마나 유사한지 확인해보려고 합니다.
 * 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ s1, s2의 길이 ≤ 100
 * 1 ≤ s1, s2의 원소의 길이 ≤ 10
 * s1과 s2의 원소는 알파벳 소문자로만 이루어져 있습니다
 * s1과 s2는 각각 중복된 원소를 갖지 않습니다.
 *
 * 입출력 예
 * s1	            s2	                        result
 * ["a", "b", "c"]	["com", "b", "d", "p", "c"]	2
 * ["n", "omg"]	    ["m", "dot"]	            0
 *
 */
public class FindingNum {
    public static int solution(int num, int k) {
        int answer = 1;
        String strNum = String.valueOf(num);
        for(int i = 0; i < strNum.length(); ++i) {
            if(k == Integer.parseInt(String.valueOf(strNum.charAt(i)))) break;
            else answer++;
        }
        if(answer > strNum.length()) answer = -1;

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int k = input.nextInt();
        System.out.println(solution(num, k));
    }

}
