package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 뒤에서 5등까지
 * 문제 유형 : 함수(메소드)
 *
 * Started : 2024-08-28
 * Solved : 2024-08-28
 *
 *
 */
public class ToTopFiveFromBack {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);

        for(int i = 0; i < 5; ++i) {
            answer[i] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray())));
    }
}
