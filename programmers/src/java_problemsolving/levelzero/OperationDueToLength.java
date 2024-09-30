package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 길이에 따른 연산
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-08-04
 * Solved : 2024-08-04
 *
 *
 */
public class OperationDueToLength {
    public static int solution(int[] num_list) {
        int answer = 0;

        if(num_list.length > 10) {
            for(int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
        } else {
            answer = 1;
            for(int i = 0; i < num_list.length; i++) {
                answer *= num_list[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num_list = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(num_list));
    }
}
