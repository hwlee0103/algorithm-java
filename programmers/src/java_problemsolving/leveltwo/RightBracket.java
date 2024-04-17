package java_problemsolving.leveltwo;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;
import java.util.Stack;

/**
 * Level : 2
 * Title : 올바른 괄호
 * 문제 유형 : 스택/큐
 *
 * Started : 2024-04-17
 * Solved : 2024-04-17
 *
 *
 */
public class RightBracket {
    // Stack 라이브러리 사용
    public static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> bracket = new Stack<Character>();
        for(Character e : s.toCharArray()) {
            if(e.equals('(')) bracket.push(e);
            else if(e.equals(')')){
                if(!bracket.empty() && bracket.peek().equals('(')){
                    bracket.pop();
                    answer = true;
                } else if(bracket.empty()){
                    answer = false;
                }
            }
        }
        if(!bracket.empty()) answer = false;
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(solution(str));
    }
}
