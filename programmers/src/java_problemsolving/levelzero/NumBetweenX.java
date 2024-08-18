package java_problemsolving.levelzero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Level : 0
 * Title : x 사이의 개수
 * 문제 유형 : 문자열
 *
 * Started : 2024-08-18
 * Solved : 2024-08-18
 *
 * 문제
 * 문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때
 * 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * 1 ≤ myString의 길이 ≤ 100,000
 * myString은 알파벳 소문자로 이루어진 문자열입니다.
 *
 * 입출력 예
 * myString	        result
 * "oxooxoxxox"	    [1, 2, 1, 0, 1, 0]
 * "xabcxdefxghi"	[0, 3, 3, 3]
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * "x"를 기준으로 문자열을 나누면 ["o", "oo", "o", "", "o", ""]가 됩니다.
 * 각각의 길이로 배열을 만들면 [1, 2, 1, 0, 1, 0]입니다. 따라서 [1, 2, 1, 0, 1, 0]을 return 합니다.
 *
 * 입출력 예 #2
 * "x"를 기준으로 문자열을 나누면 ["", "abc", "def", "ghi"]가 됩니다.
 * 각각의 길이로 배열을 만들면 [0, 3, 3, 3]입니다. 따라서 [0, 3, 3, 3]을 return 합니다.
 *
 */
public class NumBetweenX {
    public static int[] solution(String myString) {
        if(myString.charAt(myString.length() - 1) == 'x') {
            myString += " ";
        }

        String[] splitMyString = myString.split("x");
        List<Integer> ansList = new ArrayList<>();
        for(int i = 0; i < splitMyString.length; ++i) {
            if(splitMyString[i].equals(" ")) {
                ansList.add(0);
            } else {
                ansList.add(splitMyString[i].length());
            }
        }

        return ansList.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(solution(input.nextLine())));
    }
}
