package java_problemsolving.levelone;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 2
 * Title : 푸드 파이트 대회
 * 문제 유형 : 연습문제
 *
 * Started : 2024-08-14
 * Solved : 2024-08-14
 *
 *
 */
public class FoodFightContest {
    public static String solution(int[] food) {
        String post = "";
        String pre = "";
        for(int i = food.length - 1; i > 0; --i) {
            for(int j = 0; j < food[i]/2; ++j) {
                post += i;
                pre = i + pre;
            }
        }
        return pre + "0" + post;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray()));
    }
}
