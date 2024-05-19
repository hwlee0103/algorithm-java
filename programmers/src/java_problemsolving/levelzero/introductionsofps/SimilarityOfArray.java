package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열의 유사도
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
public class SimilarityOfArray {
    public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i = 0 ; i < s1.length; ++i) {
            for(int j = 0; j <s2.length; ++j) {
                if(s1[i].equals(s2[j])) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        String[] s1 = new String[n1];
        String[] s2 = new String[n2];
        for(int i = 0; i < n1 ; ++i) {
            s1[i] = input.next();
        }
        for(int i = 0; i < n2 ; ++i) {
            s2[i] = input.next();
        }

        System.out.println(solution(s1, s2));
    }
}
