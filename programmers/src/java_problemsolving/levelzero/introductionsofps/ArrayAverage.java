package java_problemsolving.levelzero.introductionsofps;

import java.util.Scanner;
/**
 * Level : 0
 * Title : 배열의 평균값
 * 문제 유형 : 코딩테스트 입문
 *
 * Started : 2024-04-23
 * Solved : 2024-04-23
 *
 * 문제
 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 0 ≤ numbers의 원소 ≤ 1,000
 * 1 ≤ numbers의 길이 ≤ 100
 * 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
 *
 * 입출력 예
 * numbers	                                    result
 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]	            5.5
 * [89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]	94.0
 *
 */
public class ArrayAverage {
    public static double solution(int[] numbers) {
        double answer = 0;
        for(int i = 0; i < numbers.length ; ++i) {
            answer += (double) numbers[i];
        }
        answer /= numbers.length;
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] spStr = str.split(", ");
        int[] numbers = new int[spStr.length];
        for(int i = 0;i < spStr.length; ++i) {
            numbers[i] = Integer.valueOf(spStr[i]);
        }
        System.out.println(solution(numbers));
    }
}
