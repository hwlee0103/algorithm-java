package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 간단한 논리 연산
 * 문제 유형 : 코딩 기초 트레이닝
 *
 * Started : 2024-07-01
 * Solved : 2024-07-01
 *
 *
 */
public class SimpleLogicalOperation {
    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        return answer = (x1 || x2) && (x3 || x4);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean x1 = input.nextBoolean();
        boolean x2 = input.nextBoolean();
        boolean x3 = input.nextBoolean();
        boolean x4 = input.nextBoolean();
        System.out.println(solution(x1,x2,x3,x4));
    }
}
