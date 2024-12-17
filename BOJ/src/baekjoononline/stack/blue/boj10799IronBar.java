package baekjoononline.stack.blue;

import java.util.Scanner;
import java.util.Stack;

/**
 * Level : Blue 2
 * Title : 10799 쇠막대기
 * 문제 유형 : 스택
 *
 * Started : 2024-12-13
 * Solved : 2024-12-
 *
 *
 */
public class boj10799IronBar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Stack<Character> stack = new Stack<Character>();

        boolean lazerFlag = false;
        int answer = 0;
        for(int i=0; i<str.length(); i++) {
            char now = str.charAt(i);
            if(now == '(') {
                if(str.charAt(i+1) == ')') {
                    lazerFlag = true;
                } else {
                    stack.push(now);
                }
            } else {
                if(lazerFlag) {
                    answer += stack.size();
                    lazerFlag = false;
                } else {
                    answer++;
                    stack.pop();
                }
            }
        }
        System.out.println(answer);
    }
}
