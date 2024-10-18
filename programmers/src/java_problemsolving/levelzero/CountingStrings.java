package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열이 몇 번 등장하는지 세기
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-14
 * Solved : 2024-08-14
 *
 *
 */
public class CountingStrings {
    public static int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0; i <= myString.length() - pat.length(); ++i) {
            String now = myString.substring(i, i + pat.length());
            if(now.equals(pat)) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextLine(), input.nextLine()));
    }
}
