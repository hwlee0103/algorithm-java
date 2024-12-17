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
        // TODO: 시간복잡도 확인 - 시간초과
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);

            if(c == '(') {
                stack.push(c);
            } else {
                if(stack.peek() == '('){ // 레이저 일 때
                    stack.push(c);
                } else { // stack.peek() == ')' 일 때
                    // 레이저 일 때 // lazer에 넣기
                    lazerFlag = true;
                    while(lazerFlag) {
                        lazer.push(stack.pop());
                        if(lazer.peek() == '(' && stack.peek() == '(') {
                            lazerFlag = false;
                        }
                    }

                    // 계산
                    answer += lazer.size()/2 + 1;
                    stack.pop();

                    //계산 끝나고 레이저 다시 in
                    while(!lazer.isEmpty()) {
                        stack.push(lazer.pop());
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
