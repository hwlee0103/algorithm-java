package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 뒤에서 5등 위로
 * 문제 유형 : 함수(메소드)
 *
 * Started : 2024-08-29
 * Solved : 2024-08-29
 *
 *
 */
public class FifthPlaceFromTheBack {
    public static int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray())));
    }
}
