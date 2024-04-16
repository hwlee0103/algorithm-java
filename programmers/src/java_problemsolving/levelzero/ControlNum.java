package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 수 조작하기1
 * 문제 유형 : 조건문
 *
 * Started : 2024-04-12
 * Solved : 2024-04-12
 *
 *
 */
public class ControlNum {
    public static int solution(int n, String control) {
        for(char c : control.toCharArray()) {
            n += (c == 'w') ? 1 : ((c == 's') ? -1 : ((c == 'd') ? 10 : -10));
//            switch (c) {
//                case 'w':
//                    n += 1;
//                    break;
//                case 's':
//                    n -= 1;
//                    break;
//                case 'd':
//                    n +=10;
//                    break;
//                case 'a':
//                    n -= 10;
//                    break;
//            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String control = input.next();

        System.out.println(solution(n, control));
    }
}
