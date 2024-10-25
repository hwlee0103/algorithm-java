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
