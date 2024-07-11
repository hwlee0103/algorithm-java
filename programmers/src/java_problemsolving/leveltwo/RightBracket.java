package java_problemsolving.leveltwo;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;
import java.util.Stack;

/**
 * Level : 2
 * Title : 올바른 괄호
 * 문제 유형 : 스택/큐
 *
 * Started : 2024-07-11
 * Solved : 2024-07-
 *
 * 문제
 * 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다.
 * 예를 들어
 * "()()" 또는 "(())()" 는 올바른 괄호입니다.
 * ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
 * '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * 문자열 s의 길이 : 100,000 이하의 자연수
 * 문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
 *
 * 입출력 예
 *  s	    answer
 * "()()"	true
 * "(())()"	true
 * ")()("	false
 * "(()("	false
 *
 *
 * 입출력 예 설명
 * 입출력 예 #1,2,3,4
 * 문제의 예시와 같습니다.
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
                } else if(bracket.empty()
                || !bracket.empty() && bracket.peek().equals(')')){
                    bracket.push(e);
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
