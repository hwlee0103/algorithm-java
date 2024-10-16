package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : k의 개수
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-20
 * Solved : 2024-06-20
 *
 *
 */
public class NumOfK {
    public static int solution(int i, int j, int k) {
        int answer = 0;
        for(int idx = i; idx <= j; ++idx) {
            int tmp = idx;
            while(tmp > 0) {
                answer += (tmp%10 == k) ? 1 : 0;
                tmp /= 10;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();
        System.out.println(solution(i, j, k));
    }
}
