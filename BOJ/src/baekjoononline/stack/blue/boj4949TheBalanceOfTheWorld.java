package baekjoononline.stack.blue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Level : Blue 4
 * Title : 4949 균형잡힌 세상 The Balance of the World
 * 문제 유형 : 스택
 *
 * Started : 2024-12-09
 * Solved : 2024-12-09
 *
 *
[)].
.
([]().
)].
(.
([)].
hello[[i like (apple)and(banana)]].
[)].
).
.
]))((()()[][[(()(([)([((([)(()[][)))[]))])][()[))))[[][([][)][[(])]](((]()]]([)[([[()[)[[](([)(]))[.
.
(((((((((((((()))))))))))).
()()()()()().
.
 */

public class boj4949TheBalanceOfTheWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "";

        List<String> list = new ArrayList<String>();
        while(true) {
            str = scan.nextLine();
            list.add(str);
            if(str.equals(".")) {break;}
        }

        List<String> strList = new ArrayList<String>();
        StringBuilder temp = new StringBuilder();
        for(int i=0; i<list.size(); i++) {
            if(!list.get(i).endsWith(".")) {
                temp.append(list.get(i));
            } else {
                strList.add(temp + list.get(i));
                temp = new StringBuilder();
            }
        }

        for (String s : strList) {
            if(s.equals(".")) break; // 문제 이해의 중요성!
            Stack<Character> stack = new Stack<Character>();
            boolean flag = false;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(' || s.charAt(j) == '[') {
                    stack.push(s.charAt(j));
                } else if (s.charAt(j) == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        System.out.println("no");
                        flag = true;
                        break;
                    } else if (stack.peek() == '(') {
                        stack.pop();
                    }
                } else if (s.charAt(j) == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        System.out.println("no");
                        flag = true;
                        break;
                    } else if (stack.peek() == '[') {
                        stack.pop();
                    }
                }
            }
            if(flag) {continue;}
            if (!stack.isEmpty()) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }
    }
}
