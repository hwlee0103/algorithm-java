package java_problemsolving.levelzero.introductionsofps;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 평행
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-06
 * Solved : 2024-06-06
 *
 * 문제
 * 점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
 *
 * [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
 * 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * dots의 길이 = 4
 * dots의 원소는 [x, y] 형태이며 x, y는 정수입니다.
 * 0 ≤ x, y ≤ 100
 * 서로 다른 두개 이상의 점이 겹치는 경우는 없습니다.
 * 두 직선이 겹치는 경우(일치하는 경우)에도 1을 return 해주세요.
 * 임의의 두 점을 이은 직선이 x축 또는 y축과 평행한 경우는 주어지지 않습니다.
 *
 * 입출력 예
 * dots	                                result
 * [[1, 4], [9, 2], [3, 8], [11, 6]]	1
 * [[3, 5], [4, 1], [2, 4], [5, 10]]	0
 *
 */
public class Parallel {
    public static int solution(int[][] dots) {
        int answer = 0;
        int firstX = dots[0][0];
        int firstY = dots[0][1];

        if((((double)Math.abs(firstY - dots[1][1])/Math.abs(firstX - dots[1][0]))
                == ((double)Math.abs(dots[3][1] - dots[2][1])/Math.abs(dots[3][0] - dots[2][0])))
                || (((double)Math.abs(firstY - dots[2][1])/Math.abs(firstX - dots[2][0]))
                == ((double)Math.abs(dots[3][1] - dots[1][1])/Math.abs(dots[3][0] - dots[1][0])))
                || (((double)Math.abs(firstY - dots[3][1])/Math.abs(firstX - dots[3][0]))
                == ((double)Math.abs(dots[2][1] - dots[1][1])/Math.abs(dots[2][0] - dots[1][0])))
        ) {
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replaceAll("\\[", "");
        String[] spStr = str.split("], ");

        int[][] dots = new int[4][2];
        for(int i = 0; i < 4; ++i) {
            String[] item = spStr[i].replaceAll("]","").split(", ");

            dots[i][0] = Integer.valueOf(item[0]);
            dots[i][1] = Integer.valueOf(item[1]);
        }

        System.out.println(solution(dots));
    }
}
