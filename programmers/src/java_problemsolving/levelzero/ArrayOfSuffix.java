package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Level : 0
 * Title : 접미사 배열
 * 문제 유형 : 코딩 기초 트레이닝 - 문자열
 *
 * Started : 2024-07-10
 * Solved : 2024-07-10
 *
 * 문제
 * 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
 * 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
 * 문자열 my_string이 매개변수로 주어질 때,
 * my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항
 * my_string은 알파벳 소문자로만 이루어져 있습니다.
 * 1 ≤ my_string의 길이 ≤ 100
 *
 * 입출력 예
 * my_string	    result
 * "banana"	        ["a", "ana", "anana", "banana", "na", "nana"]
 * "programmers"	["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 예제 1번의 my_string는 "banana"로 모든 접미사는 문제의 설명과 같습니다.
 * 이를 사전순으로 정렬하면 "a", "ana", "anana", "banana", "na", "nana"이므로 ["a", "ana", "anana", "banana", "na", "nana"]를 return 합니다.
 * 입출력 예 #2
 * 예제 2번의 my_string는 "programmers"이고 모든 접미사는
 * "programmers", "rogrammers", "ogrammers", "grammers", "rammers", "ammers", "mmers", "mers", "ers", "rs", "s"입니다.
 * 이를 사전순으로 정렬한 문자열 배열 ["ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"]를 return 합니다.
 *
 */
public class ArrayOfSuffix {
    public static String[] solution(String my_string) {
        String[] answer = {};

        ArrayList<String> ansStr = new ArrayList<>();
        for(int i = my_string.length() - 1; i >= 0; --i) {
            ansStr.add(my_string.substring(i, my_string.length()));
        }
        Collections.sort(ansStr);

        answer = new String[ansStr.size()];
        for(int i = 0; i < ansStr.size(); ++i) {
            answer[i] = ansStr.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        String[] answer = solution(my_string);

        System.out.print("[");
        for(int i = 0; i < answer.length; ++i) {
            System.out.print("\"" + answer[i] + "\"");
            if(i < answer.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
