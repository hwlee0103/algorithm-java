package java_problemsolving.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 약수의 개수와 덧셈
 * 문제 유형 : 월간 코드 챌린지 시즌 2
 *
 * Started : 2024-07-17
 * Solved : 2024-07-17
 *
 *
 */
public class NumOfDivAndAddition {
    public static int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; ++i) {
            int cnt = 0;
            for(int j = 1; j <= i; ++j) {
                if(i%j == 0) {
                    cnt++;
                }
            }
            answer += (cnt%2 == 0) ? i : -1 * i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int left = input.nextInt();
        int right = input.nextInt();
        System.out.println(solution(left, right));
    }
}
