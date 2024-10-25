package java_problemsolving.levelzero.introductionsofps;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 연속된 수의 합
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-25
 * Solved : 2024-06-25
 *
 *
 */
public class SumOfConsecutiveNums {
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = total;
        int sum = -1;
        while(true) {
            if(sum > total) {
                start--;
            } else if(sum < total) {
                start++;
            }
            if(sum == total) {
                break;
            }

            sum = 0;
            for(int i = 0; i < num; ++i) {
                sum += start - i;
            }
        }

        for(int i = 0; i < num; ++i) {
            answer[i] = start - i;
        }
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int total = input.nextInt();
        int[] answer = solution(num, total);
        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
