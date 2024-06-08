package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 겹치는 선분의 길이
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-08
 * Solved : 2024-06-
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

        boolean flag = false;

        for(int i = 0; i < 3; ++i) {
            int startX;
            int endX;
            for(int j = i + 1; j < 3; ++j) {
                // 안 겹칠 때
                if(lines[i][1] <= lines[j][0]) continue;
                else {
                    // 시작점
                    if(lines[i][0] < lines[j][0]) {
                       startX = lines[j][0];
                    } else {
                        startX = lines[i][0];
                    }
                    
                    // 끝점
                    if(lines[i][1] < lines[j][1]) {
                        endX = lines[i][1];
                    } else {
                        endX = lines[j][1];
                    }
                    
                    answer += endX - startX;
                }
            }
            if(!flag) {
                int dupStart = Math.max(lines[(i + 1) % 3][0], lines[(i + 2) % 3][0]);
                int dupEnd = Math.min(lines[(i + 1) % 3][1], lines[(i + 2) % 3][1]);
                if (dupEnd <= dupStart) continue;
                if (lines[i][1] <= dupStart) continue;
                else {
                    // 시작점
                    if (lines[i][0] < dupStart) {
                        startX = dupStart;
                    } else {
                        startX = lines[i][0];
                    }

                    // 끝점
                    if (lines[i][1] < dupEnd) {
                        endX = lines[i][1];
                    } else {
                        endX = dupEnd;
                    }

                    answer -= endX - startX;
                    flag = true;
                }
            }
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
