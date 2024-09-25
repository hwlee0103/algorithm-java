package java_problemsolving.leveltwo;

import java.util.Scanner;

/**
 * Level : 2
 * Title : 다음 큰 숫자
 * 문제 유형 : 연습문제
 *
 * Started : 2024-08-06
 * Solved : 2024-08-06
 *
 *
 */
public class NextBigNumber {
    public static int solution(int n) {
        int answer = 0;
        int nextNum = n + 1;
        int cnt = Integer.bitCount(n);
        while(true) {
            if(cnt == Integer.bitCount(nextNum)) {
                answer = nextNum;
                break;
            } else {
                nextNum++;
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
