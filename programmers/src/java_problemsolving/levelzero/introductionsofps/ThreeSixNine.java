package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 369게임
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-15
 * Solved : 2024-05-15
 *
 * 문제
 * 머쓱이는 친구들과 369게임을 하고 있습니다.
 * 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
 * 머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 1 ≤ order ≤ 1,000,000
 *
 * 입출력 예
 * order	result
 * 3	    1
 * 29423	2
 *
 */
public class ThreeSixNine {
    public static int solution(int order) {
        int answer = 0;

        while(order > 0) {
            int now = order%10;
            if(now == 3 || now == 6 || now == 9)
                answer++;
            order /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int order = input.nextInt();
        System.out.println(solution(order));
    }
}
