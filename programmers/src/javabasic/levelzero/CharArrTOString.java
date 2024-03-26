package javabasic.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 문자 리스트를 문자열로 변환하기
 * 문제 유형 : 연산
 *
 * Started : 2024-03-26
 * Solved : 2024-03-26
 *
 *
 */
public class CharArrTOString {
    public static String solution(String[] arr) {
        String answer = "";

//        for(int i = 0; i < arr.length; ++i) {
//            answer += arr[i];
//        }
        answer = String.join("", arr);

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cnt = input.nextInt();
        String[] arr = new String[cnt];
        for(int i =0; i < cnt; ++i) {
            arr[i] = input.next();
        }

        System.out.println(solution(arr));

    }
}
