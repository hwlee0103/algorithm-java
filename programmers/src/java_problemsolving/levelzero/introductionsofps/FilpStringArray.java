package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 문자열 뒤집기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-24
 * Solved : 2024-04-24
 *
 * 문제
 * 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 1,000
 *
 * 입출력 예
 * my_string	return
 * "jaron"	    "noraj"
 * "bread"	    "daerb"
 *
 */
public class FilpStringArray {
    public static String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); ++i) {
            answer += my_string.charAt(my_string.length()-i-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        System.out.println(solution(my_string));
    }
}
