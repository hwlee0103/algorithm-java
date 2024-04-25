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
 * 문제
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 2 ≤ my_string 길이 ≤ 5
 * 2 ≤ n ≤ 10
 * "my_string"은 영어 대소문자로 이루어져 있습니다.
 *
 * 입출력 예
 * my_string	n	result
 * "hello"	    3	"hhheeellllllooo"
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
