package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 홀짝 구분하기
 * 문제 유형 : 출력
 *
 * Started : 2024-03-23
 * Solved : 2024-03-23
 *
 *
 */
public class DistributeOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println((n % 2 == 0) ? n + " is even" : n + " is odd");
    }
}
