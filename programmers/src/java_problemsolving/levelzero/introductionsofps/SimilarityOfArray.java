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
