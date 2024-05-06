package java_problemsolving.levelzero.introductionsofps;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자열 정렬하기(1)
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-06
 * Solved : 2024-05-06
 *
 * 문제
 * 문자열 my_string이 매개변수로 주어질 때,
 * my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
 *
 *
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 100
 * my_string에는 숫자가 한 개 이상 포함되어 있습니다.
 * my_string은 영어 소문자 또는 0부터 9까지의 숫자로 이루어져 있습니다. - - -
 *
 * 입출력 예
 * my_string	result
 * "hi12392"	[1, 2, 2, 3, 9]
 * "p2o4i8gj2"	[2, 2, 4, 8]
 * "abcde0"	    [0]
 *
 */
public class SortingString1 {
    public static int[] solution(String my_string) {
        int[] answer = {};
        String numstr = "";
        for(Character c : my_string.toCharArray()) {
            int now = c - '0';
            if(0 <= now && now <= 9) {
                numstr += c.toString();
            }
        }
        answer = new int[numstr.length()];
        for(int i = 0; i < numstr.length(); ++i) {
            answer[i] = numstr.charAt(i) - '0';
        }
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();

        int[] answer = solution(my_string);
        System.out.print("[");
        for(int i = 0;i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

}
