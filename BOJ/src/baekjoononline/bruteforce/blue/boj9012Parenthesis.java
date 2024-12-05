package baekjoononline.bruteforce.blue;

import java.util.Scanner;
import java.util.Stack;

/**
 * Level : Blue 4
 * Title : 괄호 Parenthesis
 * 문제 유형 : 스택
 *
 * Started : 2024-11-26
 * Solved : 2024-11-29
 *
 *
 */
public class boj9012Parenthesis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        while(n > 0) {
            String str = input.nextLine();
            Stack<String> stack = new Stack<>();

            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '(') {
                    stack.push(str.charAt(i) + "");
                } else {
                    if(stack.isEmpty()) {
                        stack.push(str.charAt(i) + "");
                    } else {
                        if(stack.peek().equals("(")) {
                            stack.pop();
                        } else {
                            stack.push(str.charAt(i) + "");
                        }
                    }
                }
            }
            n--;
            if(!stack.isEmpty()) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
