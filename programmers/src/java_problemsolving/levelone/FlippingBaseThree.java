package java_problemsolving.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 3진법 뒤집기
 * 문제 유형 : 월간 코드 챌린지 시즌 1
 *
 * Started : 2024-07-24
 * Solved : 2024-07-24
 *
 *
 */
public class FlippingBaseThree {
    public static int solution(int n) {
            int answer = 0;
            long thrdNum = 0;
            while(n > 0) {
                thrdNum *= 10;
                thrdNum += n%3;
                n /= 3;
            }

            for(int i = 0; thrdNum > 0; ++i) {
                answer += (thrdNum%10) * Math.pow(3, i);
                thrdNum /= 10;
            }

            return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(solution(n));
    }
}
