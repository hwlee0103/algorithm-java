package java_problemsolving.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 나머지가 1이 되는 수 찾기
 * 문제 유형 : 월간 코드 챌린지 시즌3
 *
 * Started : 2024-07-11
 * Solved : 2024-07-11
 *
 *
 */
public class FindingRemain1Num {
    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; ++i) {
            if(n%i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(solution(n));
    }
}
