package java_problemsolving.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 내적
 * 문제 유형 : 월간 코드 챌린지 시즌 1
 *
 * Started : 2024-07-16
 * Solved : 2024-07-16
 *
 *
 */
public class DotProduct {
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; ++i) {
            answer += a[i]*b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStrA = str.split(",");
        int[] a = new int[spStrA.length];
        for(int i = 0; i < spStrA.length; ++i) {
            a[i] = Integer.valueOf(spStrA[i]);
        }
        str = input.nextLine();
        String[] spStrB = str.split(",");
        int[] b = new int[spStrB.length];
        for(int i = 0; i < spStrB.length; ++i) {
            b[i] = Integer.valueOf(spStrB[i]);
        }

        System.out.println(solution(a, b));

    }
}
