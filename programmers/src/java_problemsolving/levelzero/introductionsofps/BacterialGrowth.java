package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 세균 증식
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-23
 * Solved : 2024-05-23
 *
 * 문제
 * 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
 * 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ n ≤ 10
 * 1 ≤ t ≤ 15
 *
 * 입출력 예
 * n	t	result
 * 2	10	2048
 * 7	15	229,376
 *
 */
public class BacterialGrowth {
    public static int solution(int n, int t) {
        return (int)Math.pow(2, t) * n ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        System.out.println(solution(n, t));
    }
}
