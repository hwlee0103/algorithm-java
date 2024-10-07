package java_problemsolving.pcceproblems;

import java.util.Scanner;

/**
 * Level : 02번 / 각도 합치기
 * Title : [PCCE 기출문제]
 * 문제 유형 : [PCCE 기출문제]
 *
 * Started : 2024-10-07
 * Solved : 2024-10-07
 *
 *
 */
public class AddingAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = (angle1 + angle2)%360;
        System.out.println(sum_angle);
    }
}
