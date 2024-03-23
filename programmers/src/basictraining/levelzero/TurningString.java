package basictraining.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 돌리기
 *
 * Started : 2024-03-23
 * Solved : 2024-03-23
 *
 */
public class TurningString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0; i < str.length(); ++i) {
            System.out.println(str.charAt(i));
        }
    }
}
