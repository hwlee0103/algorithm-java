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
 * 문제
 * 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
 * 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때,
 * 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 0 ≤ score[0], score[1] ≤ 100
 * 1 ≤ score의 길이 ≤ 10
 * score의 원소 길이는 2입니다.
 * score는 중복된 원소를 갖지 않습니다.
 *
 * 입출력 예
 * score	                                                                                result
 * [[80, 70], [90, 50], [40, 70], [50, 80]]	                                                [1, 2, 4, 3]
 * [[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]	            [4, 4, 6, 2, 2, 1, 7]
 * [[1, 1], [0, 0], [2, 2]]                                                                 [2, 3, 1]
 * [[1, 3], [3, 1], [2, 3], [3, 2], [1, 2], [1, 1]]                                         [3, 3, 1, 1, 5, 6]
 * [[80, 70], [70, 80], [50, 100], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]    [4, 4, 4, 7, 2, 2, 1, 8]
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
