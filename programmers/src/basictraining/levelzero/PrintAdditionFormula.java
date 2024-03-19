package basictraining.levelzero;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 덧셈식 출력하기
 *
 * Started : 2024-03-19
 * Solved : 2024-03-19
 *
 */
public class PrintAdditionFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
