package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 배열 원소의 길이
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-08
 * Solved : 2024-05-08
 *
 * 문제
 * 문자열 배열 strlist가 매개변수로 주어집니다.
 * strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
 *
 *
 * 제한사항
 * 1 ≤ strlist 원소의 길이 ≤ 100
 * strlist는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.
 *
 * 입출력 예
 * strlist	                        result
 * ["We", "are", "the", "world!"]	[2, 3, 3, 6]
 * ["I", "Love", "Programmers."]	[1, 4, 12]
 *
 */
public class LengthOfArrayItem {
    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int idx = 0;
        for(String str : strlist) {
            answer[idx++] = str.length();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputStr = input.nextLine();
        inputStr = inputStr.replace("\"", "");
        String[] strlist = inputStr.split(", ");

        int[] answer = solution(strlist);
        System.out.print("[");
        for(int i = 0;i < answer.length; ++i) {
            System.out.print(answer[i]);
            if(i < answer.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

}
