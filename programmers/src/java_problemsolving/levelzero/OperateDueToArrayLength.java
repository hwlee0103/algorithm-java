package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열의 길이에 따라 다른 연산하기
 * 문제 유형 : 함수(메소드)
 *
 * Started : 2024-08-28
 * Solved : 2024-08-28
 *
 *
 */
public class OperateDueToArrayLength {
    public static int[] solution(int[] arr, int n) {
        int i = (arr.length%2 == 0) ? 1 : 0;
        for(; i < arr.length; i += 2) {
            arr[i] += n;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray(), input.nextInt())));
    }
}
