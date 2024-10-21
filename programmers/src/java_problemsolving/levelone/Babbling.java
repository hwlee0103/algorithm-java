package java_problemsolving.levelone;

import java.util.Scanner;
import java.util.Stack;

/**
 * Level : 1
 * Title : 옹알이 (2)
 * 문제 유형 : 연습문제
 *
 * Started : 2024-10-21
 * Solved : 2024--
 *
 *
 */
public class Babbling {
    public static int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};

        for(int i = 0; i < babbling.length; ++i) {
            Stack<String> stk = new Stack<>();

            while(babbling[i].length() > 0) {
                int k = 0;
                for(k = 0; k < words.length; ++k) {
                    if(!stk.isEmpty() && words[k].equals(stk.peek())) continue;
                    if(babbling[i].length() < words[k].length()) continue;
                    if(words[k].equals(babbling[i].substring(0, words[k].length()))) {
                        stk.push(babbling[i].substring(0, words[k].length()));
                        babbling[i] = babbling[i].substring(words[k].length(), babbling[i].length());
                        break;
                    }
                }
                if(babbling[i].length() == 0) {
                    answer++;
                }else if(k == words.length) break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] babbling = input.nextLine().replaceAll("\"", "").split(", ");
        System.out.println(solution(babbling));
    }
}
