package java_problemsolving.levelzero.introductionsofps;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 연속된 수의 합
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-25
 * Solved : 2024-06-
 *
 * 문제
 * 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
 * 두 정수 num과 total이 주어집니다.
 * 연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
 *
 * 제한사항
 * 1 ≤ num ≤ 100
 * 0 ≤ total ≤ 1000
 * num개의 연속된 수를 더하여 total이 될 수 없는 테스트 케이스는 없습니다.
 *
 * 입출력 예
 * num	total	result
 * 3	12	    [3, 4, 5]
 * 5	15	    [1, 2, 3, 4, 5]
 * 4	14	    [2, 3, 4, 5]
 * 5	5	    [-1, 0, 1, 2, 3]
 * 3    0       [-1, 0, 1]
 *
 * 입출력 예 #1
 *
 * num = 3, total = 12인 경우 [3, 4, 5]를 return합니다.
 * 입출력 예 #2
 *
 * num = 5, total = 15인 경우 [1, 2, 3, 4, 5]를 return합니다.
 * 입출력 예 #3
 *
 * 4개의 연속된 수를 더해 14가 되는 경우는 2, 3, 4, 5입니다.
 * 입출력 예 #4
 *
 * 설명 생략
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
