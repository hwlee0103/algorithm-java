package java_problemsolving.levelone;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 1
 * Title : 삼총사
 * 문제 유형 : 연습문제
 *
 * Started : 2024-07-31
 * Solved : 2024-07-31
 *
 *
 */
public class ThreeMusketeers {
    public static int solution(int[] number) {
        int answer = 0;

        answer = threeMusketeers(0, 0, 0, number);

        return answer;
    }

    public static int threeMusketeers(int nowIdx, int sum, int cnt, int[] number) {
        int answer = 0;
        int len = number.length;

        if(cnt == 3) return (sum == 0) ? 1 : 0;
        if(cnt > 3 || nowIdx >= len) return 0;
        answer += threeMusketeers(nowIdx + 1, sum + number[nowIdx], cnt + 1, number);
        answer += threeMusketeers(nowIdx + 1, sum, cnt, number);

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(number));
    }
}
