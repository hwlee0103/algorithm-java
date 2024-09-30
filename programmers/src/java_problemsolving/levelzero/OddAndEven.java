package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 홀수 vs 짝수
 * 문제 유형 : 리스트(배열)
 *
 * Started : 2024-07-29
 * Solved : 2024-07-29
 *
 *
 */
public class OddAndEven {
    public static int solution(int[] num_list) {
        int answer = 0;
        int odd = 0;
        int even = 0;
        for(int i = 0; i < num_list.length; ++i) {
            if(i%2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }
        return answer = Math.max(even, odd);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num_list = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::valueOf).toArray();
        System.out.println(solution(num_list));
    }
}
