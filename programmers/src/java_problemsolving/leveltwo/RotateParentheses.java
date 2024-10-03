package java_problemsolving.leveltwo;

import java.util.Scanner;
import java.util.Stack;

/**
 * Level : 2
 * Title : 괄호 회전하기
 * 문제 유형 : 월간 코드 챌린지 시즌 2
 *
 * Started : 2024-10-02
 * Solved : 2024-10-
 *
 *
 */
public class RotateParentheses {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        for(int i = 0; i < len; ++i) {
            // 괄호 검사
            Stack<Character> stack = new Stack<>();
            for(int j = 0; j < len; ++j) {
                Character c = s.charAt(j);
                if(c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {
                    if(stack.isEmpty()) {
                        stack.push(c);
                    } else {
                        if(stack.peek() == '(' && c == ')'
                        || stack.peek() == '{' && c == '}'
                        || stack.peek() == '[' && c == ']') {
                            stack.pop();
                        }
                    }
                }
            }
            if(stack.isEmpty()) {
                answer++;
            }

            // 회전
            String first = String.valueOf(s.charAt(0));
            s = s.substring(1, len);
            s += first;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(new RotateParentheses().solution(s));
    }
}
