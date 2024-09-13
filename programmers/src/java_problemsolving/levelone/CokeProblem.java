package java_problemsolving.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 콜라 문제
 * 문제 유형 : 연습문제
 *
 * Started : 2024-08-22
 * Solved : 2024-08-22
 *
 *
 */
public class CokeProblem {
    public static int solution(int a, int b, int n) {
        int answer = 0;
        int nowHave = n;
        while(nowHave >= a) {
            // 남아있는 수
            int remain = nowHave%a;
            // 갖다주고 받은 결과
            int returnBottle = (nowHave/a)*b;
            answer += returnBottle;
            nowHave = remain + returnBottle;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextInt(), input.nextInt(), input.nextInt()));
    }
}
