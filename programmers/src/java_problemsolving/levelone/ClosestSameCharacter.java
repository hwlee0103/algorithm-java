package java_problemsolving.levelone;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 1
 * Title : 가장 가까운 같은 글자
 * 문제 유형 : 연습문제
 *
 * Started : 2024-08-02
 * Solved : 2024-08-02
 *
 *
 */
public class ClosestSameCharacter {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alpha = new int[26];
        for(int i = 0; i < alpha.length; i++) {
            alpha[i] = -1;
        }

        for(int i = 0; i < s.length(); ++i) {
            if(i == 0) {
                answer[i] = -1;
            }
            if(alpha[s.charAt(i) - 'a'] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - alpha[s.charAt(i) - 'a'];
            }
            alpha[s.charAt(i) - 'a'] = i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(Arrays.toString(solution(s)));
    }
}
