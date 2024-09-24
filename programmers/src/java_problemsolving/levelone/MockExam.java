package java_problemsolving.levelone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 1
 * Title : 모의고사
 * 문제 유형 : 완전탐색
 *
 * Started : 2024-09-04
 * Solved : 2024-09-04
 *
 *
 */
public class MockExam {
    public static int[] solution(int[] answers) {
        int[] students = new int[3];
        int[][] guess = {{1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        int maxCnt = 0;
        for(int k = 0; k < 3; k++) {
            for(int i = 0; i < answers.length; ++i) {
                // guess와 같을 경우 students 올려주기
                if(answers[i] == guess[k][i%guess[k].length]) {
                    students[k]++;
                }
            }
            maxCnt = Math.max(maxCnt, students[k]);
        }

        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < students.length; ++i) {
            if(students[i] == maxCnt) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(Arrays.stream(input.nextLine().split(",")).mapToInt(Integer::parseInt).toArray())));
    }
}
