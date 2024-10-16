package java_problemsolving.levelone;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Level : 1
 * Title : 과일 장수
 * 문제 유형 : 연습문제
 *
 * Started : 2024-10-16
 * Solved : 2024-10-16
 *
 *
 */
public class Fruiterer {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        score = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();

        for(int i = m - 1; i < score.length; i += m) {
            answer += score[i] * m;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int m = input.nextInt();
        input.nextLine();
        int[] score = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solution(k, m, score));
    }
}
