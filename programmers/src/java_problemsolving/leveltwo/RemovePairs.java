package java_problemsolving.leveltwo;

import java.util.Scanner;
import java.util.Stack;

/**
 * Level : 2
 * Title : 짝지어 제거하기
 * 문제 유형 : 2017 팁스타운
 *
 * Started : 2024-08-08
 * Solved : 2024-08-08
 *
 *
 */
public class RemovePairs {
    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return (stack.isEmpty()) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine()));
    }
}
