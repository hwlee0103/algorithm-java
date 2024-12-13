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
        Stack<Character> lazer = new Stack<Character>();

        boolean lazerFlag = false;
        int answer = 0;
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);

            if(c == '(') {
                stack.push(c);
            } else {
                if(stack.peek() == '('){
                    // 레이저 일단 stack에 in
                    stack.push(c);
                } else { // stack.peek() == ')' 일 때
                    // TODO: 레이저 여부 판단

                    // 계산
                    if(stack.peek() == '(') {
                        lazer.push(c);
                        lazer.push(stack.pop());
                        // () 를 lazer에 담기
                    }



                    answer += lazer.size()/2 + 1;
                }
            }
        }
        System.out.println(answer);
    }

}
