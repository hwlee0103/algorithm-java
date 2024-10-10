package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 정수 찾기
 * 문제 유형 : 조건문 활용
 *
 * Started : 2024-09-09
 * Solved : 2024-09-09
 *
 *
 */
public class FindingInteger {
    public static int solution(int[] num_list, int n) {
        int answer = 0;
        for(int num : num_list) {
            if(num == n) {
                answer = 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num_list = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int n = input.nextInt();
        System.out.println(solution(num_list, n));
    }
}
