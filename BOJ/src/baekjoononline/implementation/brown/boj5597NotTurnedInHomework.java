package baekjoononline.implementation.brown;

import java.util.Scanner;

/**
 * Level : Brown 3
 * Title : 5597 과제 안 내신 분..?
 * 문제 유형 : 구현 Implementation
 *
 * Started : 2025-03-19
 * Solved : 2025-03-19
 *
 *
 *
 *
 */

public class boj5597NotTurnedInHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] student = new int[31];
        for(int i = 0;i < 28; ++i) {
            int n = input.nextInt();
            student[n] = 1;
        }

        for(int i = 1;i < student.length; ++i) {
            if(student[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
