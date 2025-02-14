package baekjoononline.mathematics.brown;

import java.util.Scanner;

/**
 * Level : Brown 3
 * Title : 1085 직사각형에서 탈출
 * 문제 유형 : 수학 Mathematics
 *
 * Started : 2025-02-14
 * Solved : 2025-02-14
 *
 *
 */
public class boj1085EscapeFromRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int w = input.nextInt();
        int h = input.nextInt();
        int widthDist = Math.min(w - x, x);
        int heightDist = Math.min(h - y, y);
        System.out.println(Math.min(widthDist, heightDist));
    }
}
