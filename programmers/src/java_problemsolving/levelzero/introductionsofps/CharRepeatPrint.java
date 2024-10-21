package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 문자 반복 출력
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-25
 * Solved : 2024-04-25
 *
 *
 */
public class CharRepeatPrint {
    public static String solution(String my_string, int n) {
        String answer = "";
        for(Character c : my_string.toCharArray()) {
            for(int i = 0; i < n;++i) {
                answer += c;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        int n = input.nextInt();
        System.out.println(solution(my_string, n));
    }
}
