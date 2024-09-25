package java_problemsolving.leveltwo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 2
 * Title : 최솟값 만들기
 * 문제 유형 : 연습문제
 *
 * Started : 2024-07-14
 * Solved : 2024-07-14
 *
 *
 */
public class MakingMinValue {
    public static int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < A.length; ++i) {
            answer += A[i]*B[B.length - i - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split("]\t\\[");
        spStr[0] = spStr[0].replaceAll("\\[", "");
        spStr[1] = spStr[1].replaceAll("]", "");
        String[] strA = spStr[0].split(", ");
        String[] strB = spStr[1].split(", ");
        int[] A = new int[strA.length];
        int[] B = new int[strB.length];
        for(int i = 0; i < strA.length; ++i) {
            A[i] = Integer.valueOf(strA[i]);
            B[i] = Integer.valueOf(strB[i]);
        }

        System.out.println(solution(A, B));
    }
}
