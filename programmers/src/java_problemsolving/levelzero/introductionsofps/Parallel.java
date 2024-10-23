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
