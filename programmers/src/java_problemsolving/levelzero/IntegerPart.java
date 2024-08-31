package java_problemsolving.levelzero;

import java.util.Scanner;

/**
 * Level : 0
 * Title : 정수 부분
 * 문제 유형 : 함수(메소드)
 *
 * Started : 2024-08-31
 * Solved : 2024-08-31
 *
 * 문제
 * 실수 flo가 매개 변수로 주어질 때,
 * flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 0 ≤ flo ≤ 100
 *
 * 입출력 예
 * flo	    result
 * 1.42	    1
 * 69.32	69
 *
 * 입출력 예 설명
 *
 * 입출력 예 #1
 * 1.42의 정수 부분은 1입니다.
 *
 * 입출력 예 #2
 * 69.32의 정수 부분은 69입니다.
 *
 */
public class IntegerPart {
    public static int solution(double flo) {
        return (int) flo;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solution(input.nextDouble()));
    }
}
