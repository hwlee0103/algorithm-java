package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 양꼬치
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-29
 * Solved : 2024-04-29
 *
 * 문제
 * 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
 * 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 0 < n < 1,000
 * n / 10 ≤ k < 1,000
 * 서비스로 받은 음료수는 모두 마십니다.
 *
 * n	k	result
 * 10	3	124,000
 * 64	6	768,000
 *
 */
public class LambSkewers {
    public static int solution(int n, int k) {
        int answer = 0;
        answer += 12000 * n;
        k -= n/10;
        answer += 2000 *k;
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        System.out.println(solution(n, k));
    }
}
