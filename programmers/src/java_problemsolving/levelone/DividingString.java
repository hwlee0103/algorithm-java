package java_problemsolving.levelone;

import java.util.Scanner;

/**
 * Level : 1
 * Title : 문자열 나누기
 * 문제 유형 : 연습문제
 *
 * Started : 2024-10-23
 * Solved : 2024-10-23
 *
 *
 */
public class DividingString {
    public int solution(String s) {
        int answer = 0;
        char x = ' ';
        int xCnt = 0;
        int yCnt = 0;

        for(int i = 0; i < s.length(); ++i) {
            if(x == ' ') {
                x = s.charAt(i);
                xCnt++;
            } else {
                if(x == s.charAt(i)) {
                    xCnt++;
                } else {
                    yCnt++;
                }
            }

            if(xCnt == yCnt) {
                answer++;
                x = ' ';
                xCnt = 0;
                yCnt = 0;
                // System.out.println("now ::: " + s.substring(0, i + 1));
            } else if(i == s.length() - 1) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(new DividingString().solution(s));
    }
}
