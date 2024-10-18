package java_problemsolving.levelzero.introductionsofps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 등수 매기기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-14
 * Solved : 2024-06-16
 *
 *
 */
public class Ranking {
    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[][] average = new double[score.length][2];

        for(int i = 0; i < score.length; ++i) {
            average[i][0] = (double) (score[i][0] + score[i][1]) /2;
            average[i][1] = i;
        }

        Arrays.sort(average, Comparator.comparingDouble((double[] o) -> o[0]).reversed());

        for(int i = 0; i < score.length; ++i) {
            answer[(int)average[i][1]] = i + 1;
            if(i > 0 && average[i][0] == average[i-1][0]) answer[(int)average[i][1]] = answer[(int)average[i-1][1]];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] score = new int[n][2];
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < 2; ++j) {
                score[i][j] = input.nextInt();
            }
        }

        int[] answer = solution(score);
        System.out.print("[");
        for(int i = 0; i < n; ++i) {
            System.out.print(answer[i]);
            if(i < n - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
