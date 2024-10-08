package java_problemsolving.pcceproblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : [PCCE 기출문제] 6번 / 가채점
 * 문제 유형 : 완전탐색
 *
 * Started : 2024-10-08
 * Solved : 2024-10-08
 *
 *
 */
public class TentativeScoring {
    public static String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] our_score = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] score_list = Arrays.stream(input.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        String[] answer = solution(numbers, our_score, score_list);
        System.out.println(answer[0]);
    }
}
