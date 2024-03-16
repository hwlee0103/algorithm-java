package basictraining.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : Flag에 따라 다른 값 반환하기
 *
 * Started : 2024-03-14
 * Solved : 2024-03-14
 *
 */
public class FlagReturnSolution {
    public static int solution(int a, int b, boolean flag) {
        int answer = 0;

        if(flag == true) {
            answer = a + b;
        } else {
            answer = a - b;
        }
        return answer;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        boolean flag = input.nextBoolean();

        int answer = solution(n, m, flag);

        System.out.println("Answer is : " + answer);
    }
}
