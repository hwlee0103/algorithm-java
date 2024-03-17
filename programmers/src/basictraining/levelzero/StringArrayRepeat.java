package basictraining.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 반복해서 출력하기
 *
 * Started : 2024-03-17
 * Solved : 2024-03-17
 *
 */
public class StringArrayRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for(int i = 0 ;i < n ; ++i) {
            System.out.print(str);
        }
    }
}
