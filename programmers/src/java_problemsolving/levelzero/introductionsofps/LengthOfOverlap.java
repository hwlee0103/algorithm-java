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
 * 문제
 * 선분 3개가 평행하게 놓여 있습니다. 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
 *
 * lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 나타내면 다음과 같습니다.
 *
 * line_2.png
 *
 * 선분이 두 개 이상 겹친 곳은 [-2, -1], [0, 1]로 길이 2만큼 겹쳐있습니다.
 *
 * 제한사항
 * lines의 길이 = 3
 * lines의 원소의 길이 = 2
 * 모든 선분은 길이가 1 이상입니다.
 * lines의 원소는 [a, b] 형태이며, a, b는 각각 선분의 양 끝점 입니다.
 * -100 ≤ a < b ≤ 100
 *
 * 입출력 예
 * lines	                    result
 * [[0, 1], [2, 5], [3, 9]]	    2
 * [[-1, 1], [1, 3], [3, 9]]	0
 * [[0, 5], [3, 9], [1, 10]]	8
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
