package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 밀기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-06-24
 * Solved : 2024-06-24
 *
 *
 */
public class PushingString {
    public static int solution(String A, String B) {
        int answer = 0;
        int size = A.length();
        for(int i = 0; i < size; ++i) {
            if(A.equals(B)) {
                break;
            }
            String tmp = String.valueOf(A.charAt(A.length()-1)) + A.substring(0, A.length() - 1);
            A = tmp;
            answer++;
        }
        return (answer == A.length()) ? -1 : answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        String B = input.nextLine();
        System.out.println(solution(A, B));
    }
}
