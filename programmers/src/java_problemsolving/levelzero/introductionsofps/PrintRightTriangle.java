package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 직각삼각형 출력하기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-25
 * Solved : 2024-04-25
 *
 *
 */
public class PrintRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        //System.out.println(n);
    }
}
