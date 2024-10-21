package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 숫자 찾기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-19
 * Solved : 2024-05-19
 *
 *
 */
public class FindingNum {
    public static int solution(int num, int k) {
        int answer = 1;
        String strNum = String.valueOf(num);
        for(int i = 0; i < strNum.length(); ++i) {
            if(k == Integer.parseInt(String.valueOf(strNum.charAt(i)))) break;
            else answer++;
        }
        if(answer > strNum.length()) answer = -1;

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int k = input.nextInt();
        System.out.println(solution(num, k));
    }

}
