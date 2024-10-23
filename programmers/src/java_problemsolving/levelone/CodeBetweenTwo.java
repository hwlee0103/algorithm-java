package java_problemsolving.levelone;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 1
 * Title : 둘만의 암호
 * 문제 유형 : 연습문제
 *
 * Started : 2024-10-23
 * Solved : 2024-
 *
 *
 */
public class CodeBetweenTwo {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] alpha = new char[26];

        for(int i = 0; i < alpha.length; ++i) {
            alpha[i] = (char)(97 + i);
        }
//        System.out.println(Arrays.toString(alpha));

        for(int i = 0; i < s.length(); ++i) {
            int cnt = 0;
            int idx = 0;
            while(cnt < index) {
                // System.out.println(alpha[s.charAt(i) - 97 + idx]);
//                idx++;
                idx = (idx + 1) % 26;
                if(skip.indexOf(alpha[(s.charAt(i) - 97 + idx)%26]) >= 0) continue;
                cnt++;
            }
            answer += String.valueOf(alpha[(s.charAt(i) - 97 + idx)%26]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String skip = input.nextLine();
        int index = input.nextInt();
        System.out.println(new CodeBetweenTwo().solution(s, skip, index));
    }
}
