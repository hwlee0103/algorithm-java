package baekjoononline.implementation.brown;

import java.util.Scanner;

/**
 * Level : Brown 5
 * Title : 25314 코딩은 체육과목 입니다
 * 문제 유형 : 구현 Implementation
 *
 * Started : 2025-03-14
 * Solved : 2025-03-
 *
 *
 *
 *
 */

public class boj25314CodingIsAPhysicalEducationSubject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String answer = "";
        for(int i = 0; i < n/4; i++) {
            answer += "long ";
        }
        answer += "int";
        System.out.println(answer);
    }
}
