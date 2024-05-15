package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 인덱스 바꾸기
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-05-15
 * Solved : 2024-05-15
 *
 * 문제
 * 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, m
 * y_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 1 < my_string의 길이 < 100
 * 0 ≤ num1, num2 < my_string의 길이
 * my_string은 소문자로 이루어져 있습니다.
 * num1 ≠ num2
 *
 * 입출력 예
 * my_string	num1	num2	result
 * "hello"	    1	    2	    "hlelo"
 * "I love you"	3	    6	    "I l veoyou"
 *
 */
public class ChangingIndex {
    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        answer += my_string.substring(0, num1);
        answer += my_string.substring(num2, num2+1);
        answer += my_string.substring(num1+1, num2);
        answer += my_string.substring(num1, num1+1);
        answer += my_string.substring(num2+1, my_string.length());
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_string = input.nextLine();
        input.reset();
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(solution(my_string,num1,num2));
    }
}
