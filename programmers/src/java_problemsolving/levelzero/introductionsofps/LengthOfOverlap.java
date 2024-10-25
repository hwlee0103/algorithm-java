package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 겹치는 선분의 길이
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-08
 * Solved : 2024-06-09
 *
 *
 */
public class LengthOfOverlap {
    public static int solution(int[][] lines) {
        int answer = 0;
        int[] counts = new int[201];

        for(int[] item : lines) {
            for(int j = item[0]; j < item[1]; ++j) {
                counts[j + 100]++;
            }
        }

        for(int i = 0; i <=200; ++i) {
            if(counts[i] > 1) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[][] lines = new int[3][2];
            for(int i = 0;i < 3 ; ++i ) {
                for(int j = 0;  j < 2; ++j) {
                    lines[i][j] = input.nextInt();
                }
            }
            System.out.println(solution(lines));
    }
}
