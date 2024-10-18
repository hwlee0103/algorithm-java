package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 종이 자르기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-24
 * Solved : 2024-06-24
 *
 *
 */
public class CuttingPaper {
    public static int solution(int M, int N) {
        int answer = M*N -1;
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();
        System.out.println(solution(M, N));
    }
}
