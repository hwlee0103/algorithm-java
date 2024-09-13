package java_problemsolving.levelzero;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 특별한 이차원 배열 1
 * 문제 유형 : 반복문 활용
 *
 * Started : 2024-09-12
 * Solved : 2024-09-12
 *
 *
 */
public class Unique2DimensionArray {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0; i < n; ++i) {
            // 다른풀이
            // 중복 for 문 없이
//            answer[i][i] = 1;
            for(int j = 0; j < n; ++j) {
                if(i==j) {
                    answer[i][j] = 1;
                } else {
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] answer = solution(input.nextInt());
        for(int i = 0; i < answer.length; ++i) {
            System.out.println(Arrays.toString(answer[i]));
        }
    }
}
