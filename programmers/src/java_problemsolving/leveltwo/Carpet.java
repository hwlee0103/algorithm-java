package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 2
 * Title : 카펫
 * 문제 유형 : 완전탐색
 *
 * Started : 2024-08-12
 * Solved : 2024-08-12
 *
 *
 */
public class Carpet {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // 가로+세로 = lengths
        int lengths = brown/2 + 2;
        for(int i = 1; i < lengths; ++i) {
            if((i * (lengths - i) == brown + yellow)
                    && ((i - 2) * (lengths - i - 2)) == yellow) {
                answer[0] = Math.max(i, lengths - i);
                answer[1] = Math.min(i, lengths - i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(input.nextInt(), input.nextInt())));
    }
}
